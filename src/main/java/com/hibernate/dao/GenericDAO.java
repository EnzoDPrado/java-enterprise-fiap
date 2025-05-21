package com.hibernate.dao;

import jakarta.persistence.EntityManager;

import java.lang.reflect.ParameterizedType;

public class GenericDAO<T, K>{

    protected EntityManager em;

    private Class<T> entityClass;

    public GenericDAO(EntityManager em) {
        this.em = em;
        this.entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public void register(T entity){
        em.persist(entity);
    }

    public void update(T entity){
        em.merge(entity);
    }

    public void delete(T entity){
        em.remove(entity);
    }

    public T findById(K id){
         return em.find(entityClass, id);
    }

    public void commit(){
        try{
            em.getTransaction().begin();
            em.getTransaction().commit();
        }catch (Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw new RuntimeException(e);
        }
    }
}
