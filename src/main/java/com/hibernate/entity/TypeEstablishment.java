package com.hibernate.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_type_establishment")
public class TypeEstablishment {
    @Id
    @SequenceGenerator(name="type_establishment", sequenceName="sq_tb_type_establishment",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="type_establishment")
    private int id;

    @Column(nullable = false,length =100)
    private String name;

    @OneToMany(mappedBy = "type")
    private List<Establishment> establishments;

    public TypeEstablishment() {}

    public TypeEstablishment(int id, String name, List<Establishment> establishments) {
        this.id = id;
        this.name = name;
        this.establishments = establishments;
    }

    public List<Establishment> getEstablishments() {
        return establishments;
    }

    public void setEstablishments(List<Establishment> establishments) {
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
}
