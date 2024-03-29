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
public class VahtkondPiiriloigul extends BaseEntity {

	@ManyToOne
	@NotNull
	private Vahtkond vahtkond;

	@ManyToOne
	@NotNull
	private Piiriloik piiriloik;

	@DateTimeFormat(style = "M-")
	@NotNull
	private Date alates;

	@DateTimeFormat(style = "M-")
	@NotNull
	private Date kuni;

	public static long countVahtkondPiiriloiguls() {
		return entityManager().createQuery(
				"SELECT COUNT(o) FROM VahtkondPiiriloigul o"
						+ BaseEntity.SQL_ROBOT_NAME, Long.class)
				.getSingleResult();
	}

	public static List<VahtkondPiiriloigul> findAllVahtkondPiiriloiguls() {
		return entityManager().createQuery(
				"SELECT o FROM VahtkondPiiriloigul o"
						+ BaseEntity.SQL_ROBOT_NAME, VahtkondPiiriloigul.class)
				.getResultList();
	}

	public static List<VahtkondPiiriloigul> findVahtkondPiiriloigulEntries(
			int firstResult, int maxResults) {
		return entityManager()
				.createQuery(
						"SELECT o FROM VahtkondPiiriloigul o"
								+ BaseEntity.SQL_ROBOT_NAME,
						VahtkondPiiriloigul.class).setFirstResult(firstResult)
				.setMaxResults(maxResults).getResultList();
	}

}
