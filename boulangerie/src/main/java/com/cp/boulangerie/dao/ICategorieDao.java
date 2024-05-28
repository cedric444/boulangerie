package com.cp.boulangerie.dao;

import com.cp.boulangerie.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategorieDao extends JpaRepository<Categorie, Integer> {
}
