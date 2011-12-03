package ee.itcollege.intsidentspring.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooEntity
public class Vahtkond extends BaseEntity {

    @NotNull
    private String kood;

	@NotNull
    private String nimetus;
    
    @DateTimeFormat(style="M-")
	@NotNull
    private Date alates;
    
    @DateTimeFormat(style="M-")
	@NotNull
    private Date kuni;
    
//    //ühisinformatsioon
//	private String avaja;
//
//	@DateTimeFormat(style = "M-")
//	private Date avatud;
//
//	private String muutja;
//
//	@DateTimeFormat(style = "M-")
//	private Date muudetud;
//
//	private String sulgeja;
//
//	@DateTimeFormat(style = "M-")
//	private Date suletud;
//
//	private String kommentaar;
	
	
		
    
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
// Roo tehtud meetodite ümber kirjutamisest üksi aga ei piisa, kuna ühe merge
// käsuga võidakse salvestada mitu JPA olemit ja kaskaadkustutamine võib viia
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
// Kes oskab võib iga olemi kallal käsitöö asemel teha ka ühist funktsionaalsust
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
// Authentication auth = SecurityContextHolder.getContext().getAuthentication();
// String userName = auth.getName();
// Kontrollerites on aga veelgi lihtsam, lihtsalt lisa meetodile Principal tüüpi
// argument:
//
// @RequestMapping(method = RequestMethod.GET)
// public String showResults(..., Principal principal, Model uiModel) {
// String userName = principal.getName();
// ...
// }
