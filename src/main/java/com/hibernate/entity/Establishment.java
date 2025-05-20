package com.hibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_establishment")
public class Establishment {
    @Id
    @SequenceGenerator(name="establishment", sequenceName="sq_tb_establishment",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="establishment")
    private int id;

    @Column(nullable = false,length =100)
    private String name;

    @OneToOne(mappedBy = "establishment")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "id_type_establishment")
    private TypeEstablishment type;

    public Establishment() {}

    public Establishment(int id, String name) {
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
