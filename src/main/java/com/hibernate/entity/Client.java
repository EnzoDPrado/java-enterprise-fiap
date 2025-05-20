package com.hibernate.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Calendar;

@Entity
@Table(name="tb_client")
public class Client {
    @Id
    @SequenceGenerator(name="client", sequenceName="sq_tb_client",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="client")
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
