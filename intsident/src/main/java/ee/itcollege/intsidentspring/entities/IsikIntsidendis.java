package ee.itcollege.intsidentspring.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class IsikIntsidendis extends BaseEntity {

	@ManyToOne
	@NotNull
	private Intsident intsident;

	@ManyToOne
	@NotNull
	private Piiririkkuja piiririkkuja;

	@DateTimeFormat(style = "M-")
	@NotNull
	private Date alates;

	@DateTimeFormat(style = "M-")
	@NotNull
	private Date kuni;

	@NotNull
	private String kirjeldus;

	public static long countIsikIntsidendises() {
		return entityManager().createQuery(
				"SELECT COUNT(o) FROM IsikIntsidendis o"
						+ BaseEntity.SQL_ROBOT_NAME, Long.class)
				.getSingleResult();
	}

	public static List<IsikIntsidendis> findAllIsikIntsidendises() {
		return entityManager().createQuery(
				"SELECT o FROM IsikIntsidendis o" + BaseEntity.SQL_ROBOT_NAME,
				IsikIntsidendis.class).getResultList();
	}

	public static List<IsikIntsidendis> findIsikIntsidendisEntries(
			int firstResult, int maxResults) {
		return entityManager()
				.createQuery(
						"SELECT o FROM IsikIntsidendis o"
								+ BaseEntity.SQL_ROBOT_NAME,
						IsikIntsidendis.class).setFirstResult(firstResult)
				.setMaxResults(maxResults).getResultList();
	}

}
