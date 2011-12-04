package ee.itcollege.intsidentspring.entities;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class Piirivalvur extends BaseEntity {

	@NotNull
	private String isikukood;
	@NotNull
	private String eesnimi;
	@NotNull
	private String perenimi;

	@NotNull
	private String sugu;
	@NotNull
	private String soduriKood;

	public static long countPiirivalvurs() {
		return entityManager().createQuery(
				"SELECT COUNT(o) FROM Piirivalvur o"+ BaseEntity.SQL_ROBOT_NAME, Long.class)
				.getSingleResult();
	}

	public static List<Piirivalvur> findAllPiirivalvurs() {
		return entityManager().createQuery("SELECT o FROM Piirivalvur o"+ BaseEntity.SQL_ROBOT_NAME,
				Piirivalvur.class).getResultList();
	}

	public static List<Piirivalvur> findPiirivalvurEntries(int firstResult,
			int maxResults) {
		return entityManager()
				.createQuery("SELECT o FROM Piirivalvur o"+ BaseEntity.SQL_ROBOT_NAME, Piirivalvur.class)
				.setFirstResult(firstResult).setMaxResults(maxResults)
				.getResultList();
	}
}
