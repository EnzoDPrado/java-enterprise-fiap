package com.hibernate.main;

import jakarta.persistence.Persistence;

public class Teste {
    public static void main(String[] args){
        Persistence.createEntityManagerFactory("testePersistence").createEntityManager();
    }
}
