package com.hibernate.main;

import com.hibernate.entity.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TesteCriacao {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testePersistence");
        EntityManager em = emf.createEntityManager();

        Client client = new Client();
        client.setName("Enzo Teste");

        try{
            em.persist(client);
            em.getTransaction().begin();
            em.getTransaction().commit();
        } catch (Exception e) {
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }

        emf.close();
        em.close();
    }
}
