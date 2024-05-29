package com.cp.boulangerie.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="produit_id")
    private Integer id;
    private String nom;
    private String description;
    private float prix;
    private String photo;

    public Produit() {
    }

    public Produit(Integer id, String nom, String description, float prix, String photo) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.photo = photo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit other = (Produit) o;
        if(id == null) {
            if(other.id != null) {
                return false;
            }
        }else if(!id.equals(other.id)) {
            return false;
        }
        if(nom == null) {
            if(other.nom != null) {
                return false;
            }
        }else if(!nom.equals(other.nom)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int prime = 1;
        int result = 31;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        return result;
    }
}
