package com.cp.boulangerie.dto;

import com.cp.boulangerie.model.Reservation;

import java.util.HashSet;
import java.util.Set;

public class ClientDto implements Comparable<ClientDto> {

    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private AdresseDto adresse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public AdresseDto getAdresse() {
        return adresse;
    }

    public void setAdresse(AdresseDto adresse) {
        this.adresse = adresse;
    }


    @Override
    public int compareTo(ClientDto o) {
        return nom.compareToIgnoreCase(o.getNom());
    }
}
