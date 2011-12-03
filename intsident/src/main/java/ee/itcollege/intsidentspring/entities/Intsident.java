package ee.itcollege.intsidentspring.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooEntity
public class Intsident  {
	
	@NotNull
	private String kood;
	
	@NotNull
	private String nimetus;
	
	@ManyToOne
	@NotNull
	private Piiriloik piiriloik;
	
	@DateTimeFormat(style="M-")
	private Date toimumise_algus;
	
	@DateTimeFormat(style="M-")
	private Date toimumise_lopp;
	
	private double GPS_longituud;
	
	private double GPS_latituud;
	
	@NotNull
	private String kirjeldus;
	
	@ManyToOne
	@NotNull
	private IntsidendiTyyp intsidendiTyyp;
	
}