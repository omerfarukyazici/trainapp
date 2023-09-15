package com.example.trainapp.controller;

import com.example.trainapp.entity.Reservation;
import com.example.trainapp.service.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<Reservation> getAllReservations(){
        return reservationService.getAllReservations();
    }

    @GetMapping("/reservationId")
    public Reservation getOneReservationById(@PathVariable Long reservationId){
        return reservationService.getOneReservationById(reservationId);
    }

    @PostMapping
    public Reservation createOneReservation(@RequestBody Reservation newReservation){
        return reservationService.createOneReservation(newReservation);
    }
    @PutMapping("/reservationId")
    public Reservation updateOneReservation(@PathVariable Long reservationId, @RequestBody Reservation updateReservation){
        return reservationService.updateOneReservation(reservationId,updateReservation);
    }
    @DeleteMapping("/reservationId")
    public void deleteReservationById(@PathVariable Long reservationId){
        reservationService.deleteReservationById(reservationId);
    }



}
