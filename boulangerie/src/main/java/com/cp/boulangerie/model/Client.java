package com.cp.boulangerie.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="client_id")
    private Long id;
    private String nom;
    private String prenom;
    @Column(unique = true)
    private String email;
    @Column(name="mot_de_passe")
    private String motDePasse;
    private String telephone;
    @ManyToOne
    @JoinColumn(name="id", referencedColumnName = "id_adresse")
    private Adresse adresse;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk_client", cascade = CascadeType.ALL)
    private HashSet<Reservation> reservations = new HashSet<>();

    public Client() {
    }

    public Client(Long id, String nom, String prenom, String email, String motDePasse, String telephone, Adresse adresse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.telephone = telephone;
        this.adresse = adresse;
    }

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

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public HashSet<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(HashSet<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null) {
            return false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        Client other = (Client) o;
        if(email == null) {
            if(other.email != null) {
                return false;
            }
        }else if(!email.equals(other.email)){
            return false;
        }
        if(id == null) {
            if(other.id != null) {
                return false;
            }
        }else if(!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
}
