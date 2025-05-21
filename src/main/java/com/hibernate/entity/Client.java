package com.hibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name="client")
@Inheritance(strategy = InheritanceType.JOINED)
public class Client {
    @Id
    @SequenceGenerator(name="type_client", sequenceName="sq_client",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="type_client")
    private int id;

    @Column(nullable = false,length =100)
    private String name;

    public Client() {}

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
