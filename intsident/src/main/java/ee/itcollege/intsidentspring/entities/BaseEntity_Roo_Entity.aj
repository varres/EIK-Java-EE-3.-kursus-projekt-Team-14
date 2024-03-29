// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.entities;

import ee.itcollege.intsidentspring.entities.BaseEntity;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;

privileged aspect BaseEntity_Roo_Entity {
    
    @Version
    @Column(name = "version")
    private Integer BaseEntity.version;
    
    public Long BaseEntity.getId() {
        return this.id;
    }
    
    public void BaseEntity.setId(Long id) {
        this.id = id;
    }
    
    public Integer BaseEntity.getVersion() {
        return this.version;
    }
    
    public void BaseEntity.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void BaseEntity.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void BaseEntity.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void BaseEntity.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public BaseEntity BaseEntity.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        BaseEntity merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static long BaseEntity.countBaseEntitys() {
        return entityManager().createQuery("SELECT COUNT(o) FROM BaseEntity o", Long.class).getSingleResult();
    }
    
    public static BaseEntity BaseEntity.findBaseEntity(Long id) {
        if (id == null) return null;
        return entityManager().find(BaseEntity.class, id);
    }
    
    public static List<BaseEntity> BaseEntity.findBaseEntityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM BaseEntity o", BaseEntity.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
