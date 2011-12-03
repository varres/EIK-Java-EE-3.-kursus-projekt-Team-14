// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.entities;

import ee.itcollege.intsidentspring.entities.Piirivalvur;
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

privileged aspect Piirivalvur_Roo_Entity {
    
    declare @type: Piirivalvur: @Entity;
    
    @PersistenceContext
    transient EntityManager Piirivalvur.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Piirivalvur.id;
    
    @Version
    @Column(name = "version")
    private Integer Piirivalvur.version;
    
    public Long Piirivalvur.getId() {
        return this.id;
    }
    
    public void Piirivalvur.setId(Long id) {
        this.id = id;
    }
    
    public Integer Piirivalvur.getVersion() {
        return this.version;
    }
    
    public void Piirivalvur.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Piirivalvur.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Piirivalvur.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Piirivalvur attached = Piirivalvur.findPiirivalvur(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Piirivalvur.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Piirivalvur.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Piirivalvur Piirivalvur.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Piirivalvur merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager Piirivalvur.entityManager() {
        EntityManager em = new Piirivalvur().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Piirivalvur.countPiirivalvurs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Piirivalvur o", Long.class).getSingleResult();
    }
    
    public static List<Piirivalvur> Piirivalvur.findAllPiirivalvurs() {
        return entityManager().createQuery("SELECT o FROM Piirivalvur o", Piirivalvur.class).getResultList();
    }
    
    public static Piirivalvur Piirivalvur.findPiirivalvur(Long id) {
        if (id == null) return null;
        return entityManager().find(Piirivalvur.class, id);
    }
    
    public static List<Piirivalvur> Piirivalvur.findPiirivalvurEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Piirivalvur o", Piirivalvur.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}