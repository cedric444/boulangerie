package com.cp.boulangerie.dao;

import com.cp.boulangerie.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface IReservationDao extends JpaRepository<Reservation, Integer> {

    public List<Reservation> findReservationByDateReservation(Date dateReservation);
    public List<Reservation> findReservationByDateRetrait(Date dateRetrait);
    public List<Reservation> findReservationByClient(Long idClient);
}
