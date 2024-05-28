package com.cp.boulangerie.dao;

import com.cp.boulangerie.model.Reservation;
import com.cp.boulangerie.model.ReservationId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface IReservationDao extends JpaRepository<Reservation, ReservationId> {

    public List<Reservation> findReservationByDateReservation(Date dateReservation);
    public List<Reservation> findReservationByDateRetrait(Date dateRetrait);
    public List<Reservation> findReservationByClient(Long idClient);
}
