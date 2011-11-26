package ee.itcollege.intsidentspring.entities;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@RooJavaBean
@RooToString
@RooEntity
public class Vahtkond_intsidendis {

    @NotNull
    private int vahtkond_intsidendis_ID;

    @NotNull
    private String avaja;

    @NotNull
    @DateTimeFormat(style = "M-")
    private Date avatud;

    @NotNull
    private String muutja;

    @NotNull
    @DateTimeFormat(style = "M-")
    private Date muudetud;

    private String sulgeja;

    @NotNull
    @DateTimeFormat(style = "M-")
    private Date suletud;

    private String kirjeldus;

    private String kommentaar;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date alates;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date kuni;

    @NotNull
    private int vahtkond_ID; //sellega seostan vahtkonna

    @NotNull
    private int intsident_ID;
}