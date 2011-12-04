package ee.itcollege.intsidentspring.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class Piiririkkuja extends BaseEntity {

	private String isikukood;

	@NotNull
	private String eesnimi;

	@NotNull
	private String perenimi;

	@NotNull
	@Length(max = 1)
	private String sugu;

	@DateTimeFormat(style = "M-")
	@NotNull
	private Date synniaeg;

	@ManyToOne
	@NotNull
	private Objekt objekt;

	public static long countPiiririkkujas() {
		return entityManager().createQuery(
				"SELECT COUNT(o) FROM Piiririkkuja o"
						+ BaseEntity.SQL_ROBOT_NAME, Long.class)
				.getSingleResult();
	}

	public static List<Piiririkkuja> findAllPiiririkkujas() {
		return entityManager().createQuery(
				"SELECT o FROM Piiririkkuja o" + BaseEntity.SQL_ROBOT_NAME,
				Piiririkkuja.class).getResultList();
	}

	public static List<Piiririkkuja> findPiiririkkujaEntries(int firstResult,
			int maxResults) {
		return entityManager()
				.createQuery(
						"SELECT o FROM Piiririkkuja o"
								+ BaseEntity.SQL_ROBOT_NAME, Piiririkkuja.class)
				.setFirstResult(firstResult).setMaxResults(maxResults)
				.getResultList();
	}

}
