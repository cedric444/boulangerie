package com.cp.boulangerie.model;

import java.io.Serializable;
import java.util.Objects;

public class ReservationId implements Serializable {

    private Long idClient;
    private int idProduit;

    public ReservationId(Long idClient, int idProduit) {
        this.idClient = idClient;
        this.idProduit = idProduit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReservationId that)) return false;
        return idProduit == that.idProduit && Objects.equals(idClient, that.idClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient, idProduit);
    }
}
