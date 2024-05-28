package com.cp.boulangerie.dao;

import com.cp.boulangerie.model.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdresseDao extends JpaRepository<Adresse, Long> {
}
