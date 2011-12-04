package ee.itcollege.intsidentspring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

	@DateTimeFormat(style = "M-")
	@NotNull
	private Date alates;

	@DateTimeFormat(style = "M-")
	@NotNull
	private Date kuni;

	public static List<Vahtkond> findAllVahtkonds() {
		
		return entityManager().createQuery(
				"SELECT o FROM Vahtkond o" + BaseEntity.SQL_ROBOT_NAME,
				Vahtkond.class).getResultList();
	}

	public static List<Vahtkond> findVahtkondEntries(int firstResult,
			int maxResults) {
		return entityManager()
				.createQuery(
						"SELECT o FROM Vahtkond o" + BaseEntity.SQL_ROBOT_NAME,
						Vahtkond.class).setFirstResult(firstResult)
				.setMaxResults(maxResults).getResultList();
	}

	public static long countVahtkonds() {
		return entityManager().createQuery(
				"SELECT COUNT(o) FROM Vahtkond o" + BaseEntity.SQL_ROBOT_NAME,
				Long.class).getSingleResult();
	}

}
