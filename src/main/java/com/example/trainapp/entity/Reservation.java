package com.example.trainapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Date reservationTime;
    String seatNumber;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "train_id")
    Train train;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "passenger_id")
    Passenger passenger;




}
