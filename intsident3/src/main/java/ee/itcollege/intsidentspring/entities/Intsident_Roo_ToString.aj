// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.entities;

import java.lang.String;

privileged aspect Intsident_Roo_ToString {
    
    public String Intsident.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Avaja: ").append(getAvaja()).append(", ");
        sb.append("Avatud: ").append(getAvatud()).append(", ");
        sb.append("GPS_latituud: ").append(getGPS_latituud()).append(", ");
        sb.append("GPS_longituud: ").append(getGPS_longituud()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Intsidendi_liik_ID: ").append(getIntsidendi_liik_ID()).append(", ");
        sb.append("Intsident_ID: ").append(getIntsident_ID()).append(", ");
        sb.append("Kirjeldus: ").append(getKirjeldus()).append(", ");
        sb.append("Kommentaar: ").append(getKommentaar()).append(", ");
        sb.append("Kood: ").append(getKood()).append(", ");
        sb.append("Muudetud: ").append(getMuudetud()).append(", ");
        sb.append("Muutja: ").append(getMuutja()).append(", ");
        sb.append("Nimetus: ").append(getNimetus()).append(", ");
        sb.append("Piiriloik_ID: ").append(getPiiriloik_ID()).append(", ");
        sb.append("Suletud: ").append(getSuletud()).append(", ");
        sb.append("Sulgeja: ").append(getSulgeja()).append(", ");
        sb.append("Toimumise_algus: ").append(getToimumise_algus()).append(", ");
        sb.append("Toimumise_lopp: ").append(getToimumise_lopp()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}