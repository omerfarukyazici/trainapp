package com.example.trainapp.request;

import lombok.Data;

import java.util.Date;

@Data

public class TrainCreateRequest {
    Long id;


    int trainNo;
    String departurePoint;
    String destinationPoint;

    Date departureTime;
    Date destinationTime;
    int capacity;
    int price;

}
