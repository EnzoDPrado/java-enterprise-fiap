package com.hibernate.teste;

import com.hibernate.entity.Client;
import com.hibernate.entity.Contract;
import com.hibernate.entity.Establishment;
import com.hibernate.entity.TypeEstablishment;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RegisterEntities {

    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("testePersistence").createEntityManager();

        TypeEstablishment typeEstablishment = new TypeEstablishment();
        typeEstablishment.setName("Shopping");

        Client client = new Client(0, "Enzo", null);

        Contract contract = new Contract(0, 2000.00, LocalDateTime.now(), null);


        List<Client> clients = new ArrayList<>();
        clients.add(client);

        Establishment establishment = new Establishment();
        establishment.setName("Plaza");
        establishment.setClients(clients);
        establishment.setType(typeEstablishment);


        contract.setEstablishment(establishment);

        em.getTransaction().begin();

        em.persist(establishment);

        em.getTransaction().commit();


        em.close();
    }
}
