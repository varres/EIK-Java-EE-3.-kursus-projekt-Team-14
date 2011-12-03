// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.entities;

import ee.itcollege.intsidentspring.entities.IsikIntsidendis;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;

privileged aspect IsikIntsidendis_Roo_Entity {
    
    declare @type: IsikIntsidendis: @Entity;
    
    @PersistenceContext
    transient EntityManager IsikIntsidendis.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long IsikIntsidendis.id;
    
    @Version
    @Column(name = "version")
    private Integer IsikIntsidendis.version;
    
    public Long IsikIntsidendis.getId() {
        return this.id;
    }
    
    public void IsikIntsidendis.setId(Long id) {
        this.id = id;
    }
    
    public Integer IsikIntsidendis.getVersion() {
        return this.version;
    }
    
    public void IsikIntsidendis.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void IsikIntsidendis.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void IsikIntsidendis.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            IsikIntsidendis attached = IsikIntsidendis.findIsikIntsidendis(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void IsikIntsidendis.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void IsikIntsidendis.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public IsikIntsidendis IsikIntsidendis.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        IsikIntsidendis merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager IsikIntsidendis.entityManager() {
        EntityManager em = new IsikIntsidendis().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long IsikIntsidendis.countIsikIntsidendises() {
        return entityManager().createQuery("SELECT COUNT(o) FROM IsikIntsidendis o", Long.class).getSingleResult();
    }
    
    public static List<IsikIntsidendis> IsikIntsidendis.findAllIsikIntsidendises() {
        return entityManager().createQuery("SELECT o FROM IsikIntsidendis o", IsikIntsidendis.class).getResultList();
    }
    
    public static IsikIntsidendis IsikIntsidendis.findIsikIntsidendis(Long id) {
        if (id == null) return null;
        return entityManager().find(IsikIntsidendis.class, id);
    }
    
    public static List<IsikIntsidendis> IsikIntsidendis.findIsikIntsidendisEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM IsikIntsidendis o", IsikIntsidendis.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
