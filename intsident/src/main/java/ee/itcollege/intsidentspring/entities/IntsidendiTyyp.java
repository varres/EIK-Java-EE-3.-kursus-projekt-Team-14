package ee.itcollege.intsidentspring.entities;

import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class IntsidendiTyyp {
	
	@NotNull
	private String kood;
	
	@NotNull
	private String nimetus;
	
}