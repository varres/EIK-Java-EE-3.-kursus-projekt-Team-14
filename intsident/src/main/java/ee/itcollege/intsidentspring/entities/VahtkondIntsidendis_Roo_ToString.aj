// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.entities;

import java.lang.String;

privileged aspect VahtkondIntsidendis_Roo_ToString {
    
    public String VahtkondIntsidendis.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alates: ").append(getAlates()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Intsident: ").append(getIntsident()).append(", ");
        sb.append("Kirjeldus: ").append(getKirjeldus()).append(", ");
        sb.append("Kuni: ").append(getKuni()).append(", ");
        sb.append("Vahtkond: ").append(getVahtkond()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}
