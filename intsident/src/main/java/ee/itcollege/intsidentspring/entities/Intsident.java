package ee.itcollege.intsidentspring.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

//CREATE TABLE INTSIDENT (
//intsident_ID         INTEGER,
//avaja                VARCHAR(32) NOT NULL,
//avatud               DATE NOT NULL,
//muutja               VARCHAR(32) NOT NULL,
//muudetud             DATE NOT NULL,
//sulgeja              VARCHAR(32),
//suletud              DATE NOT NULL,
//kood                 VARCHAR(20),
//nimetus              VARCHAR(100),
//toimumise_algus      DATE,
//toimumise_lopp       DATE,
//kirjeldus            LONG VARCHAR,
//kommentaar           LONG VARCHAR,
//piiriloik_ID         INTEGER,
//intsidendi_liik_ID   INTEGER NOT NULL,
//GPS_longituud        DECIMAL(9),
//GPS_latituud         DECIMAL(9),
//PRIMARY KEY (intsident_ID), 
//FOREIGN KEY (intsidendi_liik_ID)
//                      REFERENCES INTSIDENDI_LIIK
//                      ON DELETE RESTRICT, 
//FOREIGN KEY (piiriloik_ID)
//                      REFERENCES PIIRILOIK
//                      ON DELETE SET NULL
//);


@RooJavaBean
@RooToString
@RooEntity
public class Intsident {

    @NotNull
    private int intsident_ID;
    
    @NotNull
	private String avaja;
    
    @NotNull
    @DateTimeFormat(style="M-")
    private Date avatud;
    
    @NotNull
	private String muutja;
    
    @NotNull
    @DateTimeFormat(style="M-")
    private Date muudetud;
	
    private String sulgeja;
	
	@NotNull
	@DateTimeFormat(style="M-")
	private Date suletud;
	
	private String kood;
	
	private String nimetus;
	
	@DateTimeFormat(style="M-")
	private Date toimumise_algus;
	
	@DateTimeFormat(style="M-")
	private Date toimumise_lopp;
	
	private String kirjeldus;
	
	private String kommentaar;
	
	private int piiriloik_ID;
	
	@NotNull
	private int intsidendi_liik_ID;
	
	private int GPS_longituud;
	
	private int GPS_latituud;
	
	private int intsident_ID_FK; // FOREIGN KEY
	
	private int intsidendi_liik_ID_FK; // FOREIGN KEY
	
	private int piiriloik_ID_FK; // //FOREIGN KEY

}
