package com.hibernate.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_establishment")
public class Establishment {
    @Id
    @SequenceGenerator(name="establishment", sequenceName="sq_tb_establishment",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="establishment")
    private int id;

    @Column(nullable = false,length =100)
    private String name;

    @OneToOne(mappedBy = "establishment", cascade = CascadeType.PERSIST)
    private Contract contract;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_type_establishment")
    private TypeEstablishment type;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "tb_establishment_client",
            joinColumns = @JoinColumn(name = "id_establishment"),
            inverseJoinColumns = @JoinColumn(name = "id_client")
    )

    private List<Client> clients;

    public Establishment() {}

    public Establishment(int id, String name, Contract contract, TypeEstablishment type, List<Client> clients) {
        this.id = id;
        this.name = name;
        this.contract = contract;
        this.type = type;
        this.clients = clients;
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

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
