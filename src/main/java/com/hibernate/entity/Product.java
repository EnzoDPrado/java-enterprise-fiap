package com.hibernate.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Calendar;

@Entity
@Table(name="tb_product")
public class Product {
    @Id
    @SequenceGenerator(name="product", sequenceName="sq_tb_product",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="product")
    private int id;

    @Column(nullable = false,length =100)
    private String name;

    @Column(nullable = false)
    private double price;

    @Temporal(TemporalType.DATE)
    @Column(name="expiration_date")
    private Calendar expirationDate;

    @Column(name="created_at")
    @CreationTimestamp
    private Calendar createdAt;

    @UpdateTimestamp
    @Column(name="updated_at")
    private Calendar updatedAt;

    public Product() {
        super();
    }

    public Product(int id, String name, double price, Calendar expirationDate, Calendar createdAt, Calendar updatedAt) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Calendar getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Calendar getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Calendar createdAt) {
        this.createdAt = createdAt;
    }

    public Calendar getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Calendar updatedAt) {
        this.updatedAt = updatedAt;
    }
}
