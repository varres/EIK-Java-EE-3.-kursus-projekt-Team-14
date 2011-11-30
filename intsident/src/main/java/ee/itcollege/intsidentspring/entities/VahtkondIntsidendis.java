package ee.itcollege.intsidentspring.entities;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
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
public class VahtkondIntsidendis {

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vahtkond_ID")
//    private Set<Vahtkond> vahtkonnad = new HashSet<Vahtkond>();

    @ManyToOne
    @NotNull
    private Vahtkond vahtkond;
    
    
    @ManyToOne
    @NotNull
    private Intsident intsident;
     
    private String kirjeldus;

    private String kommentaar;

}
