package com.hibernate.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="tb_contract")
public class Contract {
    @Id
    @SequenceGenerator(name="contract", sequenceName="sq_tb_contract",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="contract")
    private int id;

    @Column(nullable = false)
    private Double value;

    @Column(name = "expiration_date")
    private LocalDateTime expirationDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_establishment")
    private Establishment establishment;

    public Contract() {}

    public Contract(Double value, LocalDateTime expirationDate) {
        this.value = value;
        this.expirationDate = expirationDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
