// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.entities;

import java.lang.String;

privileged aspect Intsident_Roo_ToString {
    
    public String Intsident.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GPS_latituud: ").append(getGPS_latituud()).append(", ");
        sb.append("GPS_longituud: ").append(getGPS_longituud()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Kirjeldus: ").append(getKirjeldus()).append(", ");
        sb.append("Kood: ").append(getKood()).append(", ");
        sb.append("Liik: ").append(getLiik()).append(", ");
        sb.append("Nimetus: ").append(getNimetus()).append(", ");
        sb.append("Piiriloik: ").append(getPiiriloik()).append(", ");
        sb.append("Toimumise_algus: ").append(getToimumise_algus()).append(", ");
        sb.append("Toimumise_lopp: ").append(getToimumise_lopp()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}
