package com.university.repository;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

/**
 * Created by lerafatova on 26.07.17.
 */
@Transactional
public abstract class AbstractJpaDAO<T> implements Serializable {
    private Class<T> clazz;

    @PersistenceContext
    EntityManager em;

    public final void setClazz(Class<T> clazzToSet){
        this.clazz = clazzToSet;
    }

    public T findOne(int id){
        return em.find(clazz, id);
    }

    public List<T> findAll(){
        return em.createQuery("from " +clazz.getName()).getResultList();
    }

    public void create(T entity){
        em.persist(entity);
    }

    public T update(T entity){
        return em.merge(entity);
    }

    public void delete(T entity){
        em.remove(entity);
    }

    public void deleteById(int entityId){
        T entity = findOne(entityId);
        delete(entity);
    }
 }
