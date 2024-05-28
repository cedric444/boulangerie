package com.cp.boulangerie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Reservation {

    @Id
    private long id_client;
    @Id
    private int id_produit;
    @Column(name = "date_reservation")
    private Date dateReservation;
    @Column(name = "date_retrait")
    private Date dateRetrait;

    public Reservation() {
    }

    public Reservation(long id_client, int id_produit, Date dateReservation, Date dateRetrait) {
        this.id_client = id_client;
        this.id_produit = id_produit;
        this.dateReservation = dateReservation;
        this.dateRetrait = dateRetrait;
    }

    public long getId_client() {
        return id_client;
    }

    public void setId_client(long id_client) {
        this.id_client = id_client;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
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
}
