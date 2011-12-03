package ee.itcollege.intsidentspring.entities;

import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.transaction.annotation.Transactional;



@MappedSuperclass
@RooToString
@Transactional
@RooEntity(mappedSuperclass = true)
public abstract class BaseEntity {

	private String avaja;

	@DateTimeFormat(style = "M-")
	private Date avatud;

	private String muutja;

	@DateTimeFormat(style = "M-")
	private Date muudetud;

	private String sulgeja;

	@DateTimeFormat(style = "M-")
	private Date suletud;
	
	private String kommentaar;
	
}
