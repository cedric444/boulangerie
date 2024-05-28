package com.cp.boulangerie.dao;

import com.cp.boulangerie.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClientDao extends JpaRepository<Client, Long> {

    public List<Client> findClientByNomIgnoreCase(String nom);

    @Query("SELECT c" +
            " FROM client c" +
            " INNER JOIN c.adresse a" +
            " WHERE c.id = :id")
    public List<Client> findClientByAdresse(@Param("id_adresse") Long id);

    public Client findClientByEmail(String email);

    public Client findClientByNomAndPrenom(String nom, String prenom);
}
