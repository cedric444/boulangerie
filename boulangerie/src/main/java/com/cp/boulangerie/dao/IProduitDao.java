package com.cp.boulangerie.dao;

import com.cp.boulangerie.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProduitDao extends JpaRepository<Produit, Integer> {

    public Produit findProduitByNom(String nom);

    @Query("SELECT p" +
            " FROM produit p" +
            " INNER JOIN categorie cat" +
            " WHERE cat.libelle= :libelle")
    public List<Produit> findProduitByCategorie(@Param("libelle") String libelle);
}
