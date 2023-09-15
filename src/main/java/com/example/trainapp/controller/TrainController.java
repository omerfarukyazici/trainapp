package com.example.trainapp.controller;

import com.example.trainapp.entity.Train;
import com.example.trainapp.service.TrainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController


@RequestMapping("/trains")
public class TrainController {

    private TrainService trainService;

    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @GetMapping
    public List<Train> getAllTrains() {
        return trainService.getAllTrains();
    }

    @GetMapping("/{trainId}")
    public Train getOneTrainById(@PathVariable Long trainId) {
        return trainService.getOneTrainById(trainId);
    }

    @PostMapping
    public Train createTrain(@RequestBody Train newTrain) {
        return trainService.createOneTrain(newTrain);

    }

    @PutMapping("/{trainId}")
    public Train updateTrain(@PathVariable Long trainId, @RequestBody Train updatedTrain) {
        return trainService.updateTrain(trainId, updatedTrain);
    }

    @DeleteMapping("/{trainId}")
    public void deleteTrain(@PathVariable Long trainId) {
        trainService.deleteTrain(trainId);
    }
}