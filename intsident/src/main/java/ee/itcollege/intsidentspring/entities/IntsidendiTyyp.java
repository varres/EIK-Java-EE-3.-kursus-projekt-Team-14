package ee.itcollege.intsidentspring.entities;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class IntsidendiTyyp extends BaseEntity {

	@NotNull
	private String kood;

	@NotNull
	private String nimetus;

	public static long countIntsidendiTyyps() {
		return entityManager().createQuery(
				"SELECT COUNT(o) FROM IntsidendiTyyp o"
						+ BaseEntity.SQL_ROBOT_NAME, Long.class)
				.getSingleResult();
	}

	public static List<IntsidendiTyyp> findAllIntsidendiTyyps() {
		return entityManager().createQuery(
				"SELECT o FROM IntsidendiTyyp o" + BaseEntity.SQL_ROBOT_NAME,
				IntsidendiTyyp.class).getResultList();
	}

	public static List<IntsidendiTyyp> findIntsidendiTyypEntries(
			int firstResult, int maxResults) {
		return entityManager()
				.createQuery(
						"SELECT o FROM IntsidendiTyyp o"
								+ BaseEntity.SQL_ROBOT_NAME,
						IntsidendiTyyp.class).setFirstResult(firstResult)
				.setMaxResults(maxResults).getResultList();
	}
}
