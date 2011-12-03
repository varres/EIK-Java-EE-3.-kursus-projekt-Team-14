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
public class VahtkondPiiriloigul {
	
	@ManyToOne
	@NotNull
	private Vahtkond vahtkond;
	
	@ManyToOne
	@NotNull
	private Piiriloik piiriloik;
	
    @DateTimeFormat(style="M-")
	@NotNull
    private Date alates;
    
    @DateTimeFormat(style="M-")
	@NotNull
    private Date kuni;
	
}
