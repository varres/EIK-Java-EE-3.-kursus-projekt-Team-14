// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.entities;

import ee.itcollege.intsidentspring.entities.Intsident;
import ee.itcollege.intsidentspring.entities.Objekt;
import java.lang.String;
import java.util.Date;

privileged aspect ObjektIntsidendis_Roo_JavaBean {
    
    public Objekt ObjektIntsidendis.getObjekt() {
        return this.objekt;
    }
    
    public void ObjektIntsidendis.setObjekt(Objekt objekt) {
        this.objekt = objekt;
    }
    
    public Intsident ObjektIntsidendis.getIntsident() {
        return this.intsident;
    }
    
    public void ObjektIntsidendis.setIntsident(Intsident intsident) {
        this.intsident = intsident;
    }
    
    public Date ObjektIntsidendis.getAlates() {
        return this.alates;
    }
    
    public void ObjektIntsidendis.setAlates(Date alates) {
        this.alates = alates;
    }
    
    public Date ObjektIntsidendis.getKuni() {
        return this.kuni;
    }
    
    public void ObjektIntsidendis.setKuni(Date kuni) {
        this.kuni = kuni;
    }
    
    public String ObjektIntsidendis.getKirjeldus() {
        return this.kirjeldus;
    }
    
    public void ObjektIntsidendis.setKirjeldus(String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }
    
}
