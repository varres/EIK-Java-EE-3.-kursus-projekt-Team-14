// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.entities;

import java.lang.String;

privileged aspect Piiriloik_Roo_ToString {
    
    public String Piiriloik.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GPS_koordinaadid: ").append(getGPS_koordinaadid()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Kood: ").append(getKood()).append(", ");
        sb.append("Nimetus: ").append(getNimetus()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}
