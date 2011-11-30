// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.entities;

import ee.itcollege.intsidentspring.entities.Piiriloik;
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

privileged aspect Piiriloik_Roo_Entity {
    
    declare @type: Piiriloik: @Entity;
    
    @PersistenceContext
    transient EntityManager Piiriloik.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Piiriloik.id;
    
    @Version
    @Column(name = "version")
    private Integer Piiriloik.version;
    
    public Long Piiriloik.getId() {
        return this.id;
    }
    
    public void Piiriloik.setId(Long id) {
        this.id = id;
    }
    
    public Integer Piiriloik.getVersion() {
        return this.version;
    }
    
    public void Piiriloik.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Piiriloik.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Piiriloik.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Piiriloik attached = Piiriloik.findPiiriloik(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Piiriloik.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Piiriloik.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Piiriloik Piiriloik.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Piiriloik merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager Piiriloik.entityManager() {
        EntityManager em = new Piiriloik().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Piiriloik.countPiiriloiks() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Piiriloik o", Long.class).getSingleResult();
    }
    
    public static List<Piiriloik> Piiriloik.findAllPiiriloiks() {
        return entityManager().createQuery("SELECT o FROM Piiriloik o", Piiriloik.class).getResultList();
    }
    
    public static Piiriloik Piiriloik.findPiiriloik(Long id) {
        if (id == null) return null;
        return entityManager().find(Piiriloik.class, id);
    }
    
    public static List<Piiriloik> Piiriloik.findPiiriloikEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Piiriloik o", Piiriloik.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}