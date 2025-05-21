package com.hibernate.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_client")
public class Client {
    @Id
    @SequenceGenerator(name="client", sequenceName="sq_tb_client",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="client")
    private int id;

    @Column(nullable = false,length =100)
    private String name;

    @ManyToMany(mappedBy = "clients")
    private List<Establishment> establishments;

    public Client() {}

    public Client(int id, String name, List<Establishment> establishments) {
        this.id = id;
        this.name = name;
        this.establishments = establishments;
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

    public List<Establishment> getEstablishments() {
        return establishments;
    }

    public void setEstablishments(List<Establishment> establishments) {
        this.establishments = establishments;
    }
}
