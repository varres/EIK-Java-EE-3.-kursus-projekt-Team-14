// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.entities;

import java.lang.String;

privileged aspect Piiririkkuja_Roo_ToString {
    
    public String Piiririkkuja.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Eesnimi: ").append(getEesnimi()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Isikukood: ").append(getIsikukood()).append(", ");
        sb.append("Objekt: ").append(getObjekt()).append(", ");
        sb.append("Perenimi: ").append(getPerenimi()).append(", ");
        sb.append("Sugu: ").append(getSugu()).append(", ");
        sb.append("Synniaeg: ").append(getSynniaeg()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}
