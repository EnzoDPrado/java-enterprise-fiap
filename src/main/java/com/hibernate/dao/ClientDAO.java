package com.hibernate.dao;

import com.hibernate.entity.Client;
import jakarta.persistence.EntityManager;

public class ClientDAO extends GenericDAO<Client,Integer>{

    public ClientDAO(EntityManager em) {
        super(em);
    }
}
