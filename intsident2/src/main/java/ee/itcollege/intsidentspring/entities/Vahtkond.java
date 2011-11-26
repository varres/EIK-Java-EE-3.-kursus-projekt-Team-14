package ee.itcollege.intsidentspring.entities;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooEntity
public class Vahtkond {

    @NotNull
    private int vahtkond_ID;

    @NotNull
    private String nimetus;

    private String kommentaar;
}