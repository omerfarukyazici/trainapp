package com.example.trainapp.service;

import com.example.trainapp.entity.Reservation;
import com.example.trainapp.repos.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {
    ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getOneReservationById(Long reservationId) {
        return reservationRepository.findById(reservationId).orElse(null);
    }

    public Reservation createOneReservation(Reservation newReservation) {
        return reservationRepository.save(newReservation);

    }

    public Reservation updateOneReservation(Long reservationId, Reservation updateReservation) {
        Optional<Reservation> reservation= reservationRepository.findById(reservationId);
        if(reservation.isPresent()){
            Reservation existingReservation = reservation.get();
            existingReservation.setReservationTime(updateReservation.getReservationTime());
            existingReservation.setPassenger(updateReservation.getPassenger());
            existingReservation.setTrain(updateReservation.getTrain());
            existingReservation.setSeatNumber(updateReservation.getSeatNumber());
        }
        return null;
    }

    public void deleteReservationById(Long reservationId) {
        reservationRepository.deleteById(reservationId);
    }
}
