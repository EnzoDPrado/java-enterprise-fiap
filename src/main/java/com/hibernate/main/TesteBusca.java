package com.hibernate.main;

import com.hibernate.entity.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TesteBusca {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testePersistence");
        EntityManager em = emf.createEntityManager();

        Client client = em.find(Client.class, 1);

        System.out.println(client.getId() + " " + client.getName());

        emf.close();
        em.close();
    }
}
