package com.cp.boulangerie.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@AssociationOverrides({
        @AssociationOverride(name="pk_client", joinColumns = @JoinColumn(name="client_id")),
        @AssociationOverride(name="pk_produit", joinColumns = @JoinColumn(name="produit_id"))
})
public class Reservation {

    @EmbeddedId
    private ReservationId pk = new ReservationId();
    @Column(name = "date_reservation")
    private Date dateReservation;
    @Column(name = "date_retrait")
    private Date dateRetrait;

    public Reservation() {
    }

    public ReservationId getPk(){
        return pk;
    }

    public void setPk(ReservationId pk){
        this.pk = pk;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Date getDateRetrait() {
        return dateRetrait;
    }

    public void setDateRetrait(Date dateRetrait) {
        this.dateRetrait = dateRetrait;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation other = (Reservation) o;
        if(pk == null) {
            if(other.pk != null) {
                return false;
            }
        }else if(!pk.equals(other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int prime = 1;
        int result = 31;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
        return result;
    }
}
