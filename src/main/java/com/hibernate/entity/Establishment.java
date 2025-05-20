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

    public Establishment(int id, String name, Contract contract, TypeEstablishment type) {
        this.id = id;
        this.name = name;
        this.contract = contract;
        this.type = type;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public TypeEstablishment getType() {
        return type;
    }

    public void setType(TypeEstablishment type) {
        this.type = type;
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
