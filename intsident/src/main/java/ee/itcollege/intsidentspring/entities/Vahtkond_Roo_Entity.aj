// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.entities;

import ee.itcollege.intsidentspring.entities.Vahtkond;
import java.lang.Long;
import javax.persistence.Entity;

privileged aspect Vahtkond_Roo_Entity {
    
    declare @type: Vahtkond: @Entity;
    
    public static Vahtkond Vahtkond.findVahtkond(Long id) {
        if (id == null) return null;
        return entityManager().find(Vahtkond.class, id);
    }
    
}
