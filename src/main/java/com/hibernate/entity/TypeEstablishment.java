package com.hibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_type_establishment")
public class TypeEstablishment {
    @Id
    @SequenceGenerator(name="type_establishment", sequenceName="sq_tb_type_establishment",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="type_establishment")
    private int id;

    @Column(nullable = false,length =100)
    private String name;

    public TypeEstablishment() {}

    public TypeEstablishment(int id, String name) {
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
