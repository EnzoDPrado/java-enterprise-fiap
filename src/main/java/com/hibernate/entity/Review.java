package com.hibernate.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="tb_review")
@IdClass(ReviewId.class)
public class Review implements Serializable {

    @Id
    @JoinColumn(name = "id_client")
    @ManyToOne(optional = false)
    private Client client;

    @Id
    @JoinColumn(name = "id_establishment")
    @ManyToOne(optional = false)
    private Establishment establishment;

    private int score;


    public Review() {}
}
