package ee.itcollege.intsidentspring.entities;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import java.util.Date;
import java.util.Set;
import ee.itcollege.intsidentspring.entities.Vahtkond;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooEntity
public class VahtkondIntsidendis extends BaseEntity {

    @ManyToOne
    @NotNull
    private Vahtkond vahtkond;    
    
    @DateTimeFormat(style="M-")
	@NotNull
    private Date alates;
    
    @DateTimeFormat(style="M-")
	@NotNull
    private Date kuni;
    
    @NotNull
    private String kirjeldus;
    
    @ManyToOne
    @NotNull
    private Intsident intsident;
     
}
