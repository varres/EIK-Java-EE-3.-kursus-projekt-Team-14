package ee.itcollege.intsidentspring.entities;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import java.util.Date;
import java.util.List;
import java.util.Set;
import ee.itcollege.intsidentspring.entities.Vahtkond;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooEntity
public class VahtkondIntsidendis extends BaseEntity {

	@ManyToOne
	@NotNull
	private Vahtkond vahtkond;

	@DateTimeFormat(style = "M-")
	@NotNull
	private Date alates;

	@DateTimeFormat(style = "M-")
	@NotNull
	private Date kuni;

	@NotNull
	private String kirjeldus;

	@ManyToOne
	@NotNull
	private Intsident intsident;

	public static long countVahtkondIntsidendises() {
		return entityManager().createQuery(
				"SELECT COUNT(o) FROM VahtkondIntsidendis o"+ BaseEntity.SQL_ROBOT_NAME, Long.class)
				.getSingleResult();
	}

	public static List<VahtkondIntsidendis> findAllVahtkondIntsidendises() {
		return entityManager().createQuery(
				"SELECT o FROM VahtkondIntsidendis o"+ BaseEntity.SQL_ROBOT_NAME,
				VahtkondIntsidendis.class).getResultList();
	}

	public static List<VahtkondIntsidendis> findVahtkondIntsidendisEntries(
			int firstResult, int maxResults) {
		return entityManager()
				.createQuery("SELECT o FROM VahtkondIntsidendis o"+ BaseEntity.SQL_ROBOT_NAME,
						VahtkondIntsidendis.class).setFirstResult(firstResult)
				.setMaxResults(maxResults).getResultList();
	}
}
