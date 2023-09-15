package com.example.trainapp.service;

import com.example.trainapp.entity.Train;
import com.example.trainapp.repos.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainService {

    TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }


    public Train getOneTrainById(Long trainId) {
        return trainRepository.findById(trainId).orElse(null);
    }


    public Train createOneTrain(Train newTrain) {
        return trainRepository.save(newTrain);
    }

    public Train updateTrain(Long trainId, Train updatedTrain) {
        Optional<Train> train =trainRepository.findById(trainId);
        if(train.isPresent()){
            Train existingTrain=train.get();
            existingTrain.setTrainNo(updatedTrain.getTrainNo());
            existingTrain.setId(updatedTrain.getId());
            existingTrain.setCapacity(updatedTrain.getCapacity());
            existingTrain.setPrice(updatedTrain.getPrice());
            existingTrain.setDepartureTime(updatedTrain.getDepartureTime());
            existingTrain.setDeparturePoint(updatedTrain.getDeparturePoint());
            existingTrain.setDestinationPoint(updatedTrain.getDestinationPoint());
            existingTrain.setDestinationTime(updatedTrain.getDestinationTime());
            existingTrain.setReservations(updatedTrain.getReservations());

        }
return null;
    }

    public void deleteTrain(Long trainId) {
        trainRepository.deleteById(trainId);
    }
}
