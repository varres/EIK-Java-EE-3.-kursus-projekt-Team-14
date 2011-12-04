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
public class ObjektIntsidendis extends BaseEntity {

	@ManyToOne
	@NotNull
	private Objekt objekt;

	@ManyToOne
	@NotNull
	private Intsident intsident;

	@DateTimeFormat(style = "M-")
	@NotNull
	private Date alates;

	@DateTimeFormat(style = "M-")
	@NotNull
	private Date kuni;

	@NotNull
	private String kirjeldus;

	public static long countObjektIntsidendises() {
		return entityManager().createQuery(
				"SELECT COUNT(o) FROM ObjektIntsidendis o"
						+ BaseEntity.SQL_ROBOT_NAME, Long.class)
				.getSingleResult();
	}

	public static List<ObjektIntsidendis> findAllObjektIntsidendises() {
		return entityManager()
				.createQuery(
						"SELECT o FROM ObjektIntsidendis o"
								+ BaseEntity.SQL_ROBOT_NAME,
						ObjektIntsidendis.class).getResultList();
	}

	public static List<ObjektIntsidendis> findObjektIntsidendisEntries(
			int firstResult, int maxResults) {
		return entityManager()
				.createQuery(
						"SELECT o FROM ObjektIntsidendis o"
								+ BaseEntity.SQL_ROBOT_NAME,
						ObjektIntsidendis.class).setFirstResult(firstResult)
				.setMaxResults(maxResults).getResultList();
	}
}
