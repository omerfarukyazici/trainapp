package com.example.trainapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    int trainNo;
    String departurePoint;
    String destinationPoint;

    Date departureTime;
    Date destinationTime;
    int capacity;
    int price;

    @OneToMany(mappedBy = "train")
    List<Reservation> reservations;


}
