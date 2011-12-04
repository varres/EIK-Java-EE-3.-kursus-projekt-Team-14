package ee.itcollege.intsidentspring.entities;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class Objekt extends BaseEntity {

	@NotNull
	private String nimetus;

	public static long countObjekts() {
		return entityManager().createQuery(
				"SELECT COUNT(o) FROM Objekt o" + BaseEntity.SQL_ROBOT_NAME,
				Long.class).getSingleResult();
	}

	public static List<Objekt> findAllObjekts() {
		return entityManager().createQuery(
				"SELECT o FROM Objekt o" + BaseEntity.SQL_ROBOT_NAME,
				Objekt.class).getResultList();
	}

	public static List<Objekt> findObjektEntries(int firstResult, int maxResults) {
		return entityManager()
				.createQuery(
						"SELECT o FROM Objekt o" + BaseEntity.SQL_ROBOT_NAME,
						Objekt.class).setFirstResult(firstResult)
				.setMaxResults(maxResults).getResultList();
	}

}
