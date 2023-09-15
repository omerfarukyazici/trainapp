package com.example.trainapp.request;

import com.example.trainapp.entity.Passenger;
import com.example.trainapp.entity.Train;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
public class ReservationCreateRequest {

    Long id;

    Date reservationTime;
    String seatNumber;
    Long trainId;
    Long passengerId;



}
