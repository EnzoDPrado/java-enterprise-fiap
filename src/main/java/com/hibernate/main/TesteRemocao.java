package com.hibernate.main;

import com.hibernate.entity.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TesteRemocao {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testePersistence");
        EntityManager em = emf.createEntityManager();

        Client client = em.find(Client.class, 1);
        em.remove(client);

        try{
            em.getTransaction().begin();
            em.getTransaction().commit();
        } catch (Exception e) {
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }


        System.out.println(client.getId() + " " + client.getName());

        emf.close();
        em.close();
    }
}
