package ee.itcollege.intsidentspring.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooEntity
public class Vahtkond extends BaseEntity {

    @NotNull
    private String kood;

	@NotNull
    private String nimetus;
    
    @DateTimeFormat(style="M-")
	@NotNull
    private Date alates;
    
    @DateTimeFormat(style="M-")
	@NotNull
    private Date kuni;
    
}



