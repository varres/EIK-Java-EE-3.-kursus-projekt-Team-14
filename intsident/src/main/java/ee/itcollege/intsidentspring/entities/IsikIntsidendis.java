package ee.itcollege.intsidentspring.entities;

import java.util.Date;

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

}
