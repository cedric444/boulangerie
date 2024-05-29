package com.cp.boulangerie.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class ReservationId  implements Serializable {

    @ManyToOne
    private Client client;
    @ManyToOne
    private Produit produit;

    public ReservationId(){
        super();
    }

    public ReservationId(Client client, Produit produit){
        this.client = client;
        this.produit = produit;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationId other = (ReservationId) o;
        if(client == null) {
            if(other.client != null) {
                return false;
            }
        }else if(!client.equals(other.client)){
            return false;
        }
        if(produit == null) {
            if(other.produit != null){
                return false;
            }
        }else if(!produit.equals(other.produit)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int prime = 1;
        int result = 31;
        result = prime * result + ((client == null) ? 0 : client.hashCode());
        result = prime * result + ((produit == null) ? 0 : produit.hashCode());
        return result;
    }
}
