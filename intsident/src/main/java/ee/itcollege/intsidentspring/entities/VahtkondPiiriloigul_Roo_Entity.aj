// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.entities;

import ee.itcollege.intsidentspring.entities.VahtkondPiiriloigul;
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

privileged aspect VahtkondPiiriloigul_Roo_Entity {
    
    declare @type: VahtkondPiiriloigul: @Entity;
    
    @PersistenceContext
    transient EntityManager VahtkondPiiriloigul.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long VahtkondPiiriloigul.id;
    
    @Version
    @Column(name = "version")
    private Integer VahtkondPiiriloigul.version;
    
    public Long VahtkondPiiriloigul.getId() {
        return this.id;
    }
    
    public void VahtkondPiiriloigul.setId(Long id) {
        this.id = id;
    }
    
    public Integer VahtkondPiiriloigul.getVersion() {
        return this.version;
    }
    
    public void VahtkondPiiriloigul.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void VahtkondPiiriloigul.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void VahtkondPiiriloigul.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            VahtkondPiiriloigul attached = VahtkondPiiriloigul.findVahtkondPiiriloigul(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void VahtkondPiiriloigul.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void VahtkondPiiriloigul.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public VahtkondPiiriloigul VahtkondPiiriloigul.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        VahtkondPiiriloigul merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager VahtkondPiiriloigul.entityManager() {
        EntityManager em = new VahtkondPiiriloigul().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long VahtkondPiiriloigul.countVahtkondPiiriloiguls() {
        return entityManager().createQuery("SELECT COUNT(o) FROM VahtkondPiiriloigul o", Long.class).getSingleResult();
    }
    
    public static List<VahtkondPiiriloigul> VahtkondPiiriloigul.findAllVahtkondPiiriloiguls() {
        return entityManager().createQuery("SELECT o FROM VahtkondPiiriloigul o", VahtkondPiiriloigul.class).getResultList();
    }
    
    public static VahtkondPiiriloigul VahtkondPiiriloigul.findVahtkondPiiriloigul(Long id) {
        if (id == null) return null;
        return entityManager().find(VahtkondPiiriloigul.class, id);
    }
    
    public static List<VahtkondPiiriloigul> VahtkondPiiriloigul.findVahtkondPiiriloigulEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM VahtkondPiiriloigul o", VahtkondPiiriloigul.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
