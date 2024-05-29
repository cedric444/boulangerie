package com.cp.boulangerie.dto;

public class ProduitDto implements Comparable<ProduitDto> {

    private int id;
    private String nom;
    private String description;
    private float prix;
    private String photo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    public int compareTo(ProduitDto o) {
        return nom.compareToIgnoreCase(o.getNom());
    }
}
