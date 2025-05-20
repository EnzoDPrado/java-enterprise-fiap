package com.hibernate.entity;

import java.io.Serializable;
import java.util.Objects;

public class ReviewId implements Serializable {
    private int client;

    private int establishment;

    public ReviewId() {
    }

    public ReviewId(int client, int establishment) {
        this.client = client;
        this.establishment = establishment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ReviewId reviewId = (ReviewId) o;
        return client == reviewId.client && establishment == reviewId.establishment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, establishment);
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public int getEstablishment() {
        return establishment;
    }

    public void setEstablishment(int establishment) {
        this.establishment = establishment;
    }
}
