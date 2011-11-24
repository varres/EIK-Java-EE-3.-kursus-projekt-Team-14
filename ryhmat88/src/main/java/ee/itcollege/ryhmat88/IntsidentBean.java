package ee.itcollege.ryhmat88;

import java.util.Date;

//CREATE TABLE INTSIDENT (
//	       intsident_ID         INTEGER,
//	       avaja                VARCHAR(32) NOT NULL,
//	       avatud               DATE NOT NULL,
//	       muutja               VARCHAR(32) NOT NULL,
//	       muudetud             DATE NOT NULL,
//	       sulgeja              VARCHAR(32),
//	       suletud              DATE NOT NULL,
//	       kood                 VARCHAR(20),
//	       nimetus              VARCHAR(100),
//	       toimumise_algus      DATE,
//	       toimumise_lopp       DATE,
//	       kirjeldus            LONG VARCHAR,
//	       kommentaar           LONG VARCHAR,
//	       piiriloik_ID         INTEGER,
//	       intsidendi_liik_ID   INTEGER NOT NULL,
//	       GPS_longituud        DECIMAL(9),
//	       GPS_latituud         DECIMAL(9),
//	       PRIMARY KEY (intsident_ID), 
//	       FOREIGN KEY (intsidendi_liik_ID)
//	                             REFERENCES INTSIDENDI_LIIK
//	                             ON DELETE RESTRICT, 
//	       FOREIGN KEY (piiriloik_ID)
//	                             REFERENCES PIIRILOIK
//	                             ON DELETE SET NULL
//	);

public class IntsidentBean {

	private int intsident_ID;
	private String avaja;
	private Date avatud;
	private String muutja;
	private Date muudetud;
	private String sulgeja;
	private Date suletud;
	private String kood;
	private String nimetus;
	private Date toimumise_algus;
	private Date toimumise_lopp;
	private String kirjeldus;
	private String kommentaar;
	private int piiriloik_ID;
	private int intsidendi_liik_ID;
	private int GPS_longituud;
	private int GPS_latituud;
	private int intsident_ID_FK; // FOREIGN KEY
	private int intsidendi_liik_ID_FK; // FOREIGN KEY
	private int piiriloik_ID_FK; // //FOREIGN KEY
	
	public int getIntsident_ID() {
		return intsident_ID;
	}
	public void setIntsident_ID(int intsident_ID) {
		this.intsident_ID = intsident_ID;
	}
	public String getAvaja() {
		return avaja;
	}
	public void setAvaja(String avaja) {
		this.avaja = avaja;
	}
	public Date getAvatud() {
		return avatud;
	}
	public void setAvatud(Date avatud) {
		this.avatud = avatud;
	}
	public String getMuutja() {
		return muutja;
	}
	public void setMuutja(String muutja) {
		this.muutja = muutja;
	}
	public Date getMuudetud() {
		return muudetud;
	}
	public void setMuudetud(Date muudetud) {
		this.muudetud = muudetud;
	}
	public String getSulgeja() {
		return sulgeja;
	}
	public void setSulgeja(String sulgeja) {
		this.sulgeja = sulgeja;
	}
	public Date getSuletud() {
		return suletud;
	}
	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}
	public String getKood() {
		return kood;
	}
	public void setKood(String kood) {
		this.kood = kood;
	}
	public String getNimetus() {
		return nimetus;
	}
	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}
	public Date getToimumise_algus() {
		return toimumise_algus;
	}
	public void setToimumise_algus(Date toimumise_algus) {
		this.toimumise_algus = toimumise_algus;
	}
	public Date getToimumise_lopp() {
		return toimumise_lopp;
	}
	public void setToimumise_lopp(Date toimumise_lopp) {
		this.toimumise_lopp = toimumise_lopp;
	}
	public String getKirjeldus() {
		return kirjeldus;
	}
	public void setKirjeldus(String kirjeldus) {
		this.kirjeldus = kirjeldus;
	}
	public String getKommentaar() {
		return kommentaar;
	}
	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}
	public int getPiiriloik_ID() {
		return piiriloik_ID;
	}
	public void setPiiriloik_ID(int piiriloik_ID) {
		this.piiriloik_ID = piiriloik_ID;
	}
	public int getIntsidendi_liik_ID() {
		return intsidendi_liik_ID;
	}
	public void setIntsidendi_liik_ID(int intsidendi_liik_ID) {
		this.intsidendi_liik_ID = intsidendi_liik_ID;
	}
	public int getGPS_longituud() {
		return GPS_longituud;
	}
	public void setGPS_longituud(int gPS_longituud) {
		GPS_longituud = gPS_longituud;
	}
	public int getGPS_latituud() {
		return GPS_latituud;
	}
	public void setGPS_latituud(int gPS_latituud) {
		GPS_latituud = gPS_latituud;
	}
	public int getIntsident_ID_FK() {
		return intsident_ID_FK;
	}
	public void setIntsident_ID_FK(int intsident_ID_FK) {
		this.intsident_ID_FK = intsident_ID_FK;
	}
	public int getIntsidendi_liik_ID_FK() {
		return intsidendi_liik_ID_FK;
	}
	public void setIntsidendi_liik_ID_FK(int intsidendi_liik_ID_FK) {
		this.intsidendi_liik_ID_FK = intsidendi_liik_ID_FK;
	}
	public int getPiiriloik_ID_FK() {
		return piiriloik_ID_FK;
	}
	public void setPiiriloik_ID_FK(int piiriloik_ID_FK) {
		this.piiriloik_ID_FK = piiriloik_ID_FK;
	}


}
