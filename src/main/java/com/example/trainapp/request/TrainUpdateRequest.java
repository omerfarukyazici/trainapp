package com.example.trainapp.request;

import lombok.Data;

import java.util.Date;

@Data
public class TrainUpdateRequest {


    int trainNo;
    String departurePoint;
    String destinationPoint;

    Date departureTime;
    Date destinationTime;
    int capacity;
    int price;
}
