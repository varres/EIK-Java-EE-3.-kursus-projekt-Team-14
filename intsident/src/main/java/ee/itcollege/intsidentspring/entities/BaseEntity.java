package ee.itcollege.intsidentspring.entities;

import java.awt.Robot;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.text.ParseException;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PersistenceContext;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;

@MappedSuperclass
@RooToString
@RooEntity(mappedSuperclass = true)
public abstract class BaseEntity {

	public static final String ROBOT_NAME = "SURROGAAT-ROBOT";
	public static final String SQL_ROBOT_NAME = " WHERE sulgeja = '"
			+ BaseEntity.ROBOT_NAME + "'";

	public String avaja;

	@DateTimeFormat(style = "M-")
	public Date avatud;

	public String muutja;

	@DateTimeFormat(style = "M-")
	public Date muudetud;

	public String sulgeja;

	@DateTimeFormat(style = "M-")
	public Date suletud;

	public String kommentaar;

	// turva implementeerimine algab siit

	@PersistenceContext
	transient EntityManager entityManager;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	public static final EntityManager entityManager() {
		EntityManager em = new BaseEntity() {
		}.entityManager;
		if (em == null)
			throw new IllegalStateException(
					"Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
		return em;
	}

	// persist - salvestab uue objekti andmebaasi
	// merge - salvestab muudetud objekti
	// remove - "kustutab" objekti (siin saab realiseerida kustutamise asemel
	// "sulgemise")
	// findAllOlem - leiab kõik read (suletud read saab siin välja filtreerida)
	// @Transactional
	// public void persist() {
	// if (this.entityManager == null)
	// this.entityManager = entityManager();
	// this.entityManager.persist(this);
	// }

	@Transactional
	public void remove() {
		Authentication auth = SecurityContextHolder.getContext()
				.getAuthentication();
		String userName = auth.getName();
		if (this.entityManager == null)
			this.entityManager = entityManager();
		if (this.entityManager.contains(this)) {

			sulgeja = userName;
			suletud = new Date();
			this.merge();
			// this.entityManager.remove(this);
		} else {
			sulgeja = userName;
			suletud = new Date();
			this.merge();
			// BaseEntity attached = BaseEntity.findBaseEntity(this.id);
			// this.entityManager.remove(attached);
		}
	}

	// @Transactional
	// public BaseEntity merge() {
	// if (this.entityManager == null)
	// this.entityManager = entityManager();
	// BaseEntity merged = this.entityManager.merge(this);
	// this.entityManager.flush();
	// return merged;
	// }

	// siin removin need mis on "kustutatud"
	public static List<BaseEntity> findAllBaseEntitys() {

		// debug
		// int count = entityManager().createQuery(
		// "SELECT o FROM BaseEntity o WHERE o.sulgeja = '" + robotName
		// + "'", BaseEntity.class).getResultList().size();
		//
		// int count2 = entityManager().createQuery(
		// "SELECT o FROM BaseEntity o",
		// BaseEntity.class).getResultList().size();
		//
		// int count3 = entityManager().createQuery(
		// "SELECT o FROM BaseEntity o WHERE sulgeja = '" + robotName
		// + "'", BaseEntity.class).getResultList().size();
		//
		//
		// return entityManager().createQuery(
		// "SELECT o FROM BaseEntity o WHERE o.sulgeja = '" + robotName
		// + "'", BaseEntity.class).getResultList();

		return entityManager().createQuery("SELECT o FROM BaseEntity o",
				BaseEntity.class).getResultList();
	}

	@PrePersist
	public void recordCreated() {

		// kui luuakse uus kirje, siis panen muudetud/muutja/suletud/sulgeja
		// kohale vastavad väärtused

		Authentication auth = SecurityContextHolder.getContext()
				.getAuthentication();
		String userName = auth.getName();

		avatud = new Date();
		avaja = userName;
		try {
			muudetud = new SimpleDateFormat("yyyy-MM-dd").parse("9999-12-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		muutja = ROBOT_NAME;
		try {
			suletud = new SimpleDateFormat("yyyy-MM-dd").parse("9999-12-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sulgeja = ROBOT_NAME;
	}

	@PreUpdate
	public void recordModified() {

		// kui muudetakse midagi siis vastavalt sellele muudan ka
		// muudetud/muutja välju

		Authentication auth = SecurityContextHolder.getContext()
				.getAuthentication();
		String userName = auth.getName();

		muudetud = new Date();
		muutja = userName;
	}

	@PreRemove
	public void preventRemove() {
		throw new SecurityException("Removing of bears is prohibited!");
	}

	// Andmebaasi skeemist tulenevate auditeerimisnõuete (avaja, muutja jne)
	// tagamiseks tuleb teha igale olemile neid nõudeid realiseerivad meetodid.
	//
	// Kõige mõistlikum on kasutada kombinatsiooni Roo ja JPA vahenditest. Roo
	// tekitab igale olemile automaatselt järgmised meetodid:
	//
	// persist - salvestab uue objekti andmebaasi
	// merge - salvestab muudetud objekti
	// remove - "kustutab" objekti (siin saab realiseerida kustutamise asemel
	// "sulgemise")
	// findAllOlem - leiab kõik read (suletud read saab siin välja filtreerida)
	// Roo poolt genereeritud kood on hea copy-paste materjal :)
	//
	// Roo tehtud meetodite ümber kirjutamisest üksi aga ei piisa, kuna ühe
	// merge
	// käsuga võidakse salvestada mitu JPA olemit ja kaskaadkustutamine võib
	// viia
	// ikkagi mõne olemi kustutamiseni.
	//
	// Muutmiskuupäevade ja isikute kindla peale salvestamiseks ning
	// kaskaadkustutamise vältimiseks on vaja kasutada JPA olemi elutsükli
	// annotatsioone. Näiteks:
	//
	// @PrePersist
	// public void recordCreated() {
	// setCreated( new Date() );
	// }
	//
	// @PreUpdate
	// public void recordModified() {
	// setModified( new Date() );
	// }
	//
	// @PreRemove
	// public void preventRemove() {
	// throw new SecurityException("Removing of bears is prohibited!");
	// }
	// Lisaks on tõenäoliselt vaja muudatusi majandada ka merge meetodist:
	//
	// @Transactional
	// public XXX merge() {
	// ...
	// if(id != null && !entityManager.contains(this)) {
	// XXX oldEntity = entityManager.find(getClass(), id);
	// if(getCreated() == null)
	// setCreated(oldEntity.getCreated());
	// ...
	// }
	// ...
	// }
	// Kes oskab võib iga olemi kallal käsitöö asemel teha ka ühist
	// funktsionaalsust
	// ja väljasid sisaldava baasklassi:
	//
	// ...
	// @MappedSuperclass
	// @RooToString
	// @RooEntity(mappedSuperclass = true)
	// public abstract class BaseEntity {
	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	// private Long id;
	// ...

	// Kui kasutad Spring Security-t, siis saab kasutajanime praktiliselt igalt
	// poolt kätte nii:
	//
	// Authentication auth =
	// SecurityContextHolder.getContext().getAuthentication();
	// String userName = auth.getName();
	// Kontrollerites on aga veelgi lihtsam, lihtsalt lisa meetodile Principal
	// tüüpi
	// argument:
	//
	// @RequestMapping(method = RequestMethod.GET)
	// public String showResults(..., Principal principal, Model uiModel) {
	// String userName = principal.getName();
	// ...
	// }

	public String getAvaja() {
		return avaja;
	}

	public void setAvaja(String avaja) {
		this.avaja = avaja;
	}

	public Date getAvatud() {
		return avatud;
	}

	public void setAvatud(Date avatud) {
		this.avatud = avatud;
	}

	public String getMuutja() {
		return muutja;
	}

	public void setMuutja(String muutja) {
		this.muutja = muutja;
	}

	public Date getMuudetud() {
		return muudetud;
	}

	public void setMuudetud(Date muudetud) {
		this.muudetud = muudetud;
	}

	public String getSulgeja() {
		return sulgeja;
	}

	public void setSulgeja(String sulgeja) {
		this.sulgeja = sulgeja;
	}

	public Date getSuletud() {
		return suletud;
	}

	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}

	public String getKommentaar() {
		return kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}

}
