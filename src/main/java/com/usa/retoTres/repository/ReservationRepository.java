package com.usa.retoTres.repository;


import com.usa.retoTres.model.Reservation;
import com.usa.retoTres.repository.crud.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> findAll(){
        return (List<Reservation>) reservationCrudRepository.findAll();

    }

    public Optional<Reservation> getReservation(int id){
        return reservationCrudRepository.findById(id);
    }

    public Reservation save(Reservation reservation) {
        return reservationCrudRepository.save(reservation);

    }
    public void delete(Reservation reservation) {
        reservationCrudRepository.delete(reservation);

    }
}
