package com.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="client_admin")
public class ClientAdmin extends Client {

    @Column(nullable = false, length = 100)
    private String position;

    public ClientAdmin() {}

    public ClientAdmin(String name, String position) {
        super(0, name);
        this.position = position;
    }

    public String setPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
