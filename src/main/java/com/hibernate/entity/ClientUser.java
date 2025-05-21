package com.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="client_user")
public class ClientUser extends Client {

    @Column(nullable = false, length = 100)
    private String course;

    public ClientUser() {}

    public ClientUser(String name, String course) {
        super(0, name);
        this.course = course;
    }

    public String setCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
