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
public class PiirivalvurIntsidendis extends BaseEntity {

	@ManyToOne
	@NotNull
	private Intsident intsident;

	@ManyToOne
	@NotNull
	private Piirivalvur piirivalvur;

	@ManyToOne
	@NotNull
	private VahtkondIntsidendis vahtkondIntsidendis;

	@DateTimeFormat(style = "M-")
	@NotNull
	private Date alates;

	@DateTimeFormat(style = "M-")
	@NotNull
	private Date kuni;

	@NotNull
	private String kirjeldus;

	public static long countPiirivalvurIntsidendises() {
		return entityManager().createQuery(
				"SELECT COUNT(o) FROM PiirivalvurIntsidendis o"+ BaseEntity.SQL_ROBOT_NAME, Long.class)
				.getSingleResult();
	}

	public static List<PiirivalvurIntsidendis> findAllPiirivalvurIntsidendises() {
		return entityManager().createQuery(
				"SELECT o FROM PiirivalvurIntsidendis o"+ BaseEntity.SQL_ROBOT_NAME,
				PiirivalvurIntsidendis.class).getResultList();
	}

	public static List<PiirivalvurIntsidendis> findPiirivalvurIntsidendisEntries(
			int firstResult, int maxResults) {
		return entityManager()
				.createQuery("SELECT o FROM PiirivalvurIntsidendis o"+ BaseEntity.SQL_ROBOT_NAME,
						PiirivalvurIntsidendis.class)
				.setFirstResult(firstResult).setMaxResults(maxResults)
				.getResultList();
	}

}
