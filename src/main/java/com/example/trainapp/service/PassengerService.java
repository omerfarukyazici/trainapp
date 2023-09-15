package com.example.trainapp.service;

import com.example.trainapp.entity.Passenger;
import com.example.trainapp.repos.PassengerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {

    private final PassengerRepository passengerRepository;

    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public Passenger saveOnePassenger(Passenger newPassenger) {
        return passengerRepository.save(newPassenger);
    }

    public Passenger getOnePassenger(Long passengerId) {
        return passengerRepository.findById(passengerId).orElse(null);
    }

    public Passenger updateOnePassenger(Long passengerId, Passenger newPassenger) {
        Optional<Passenger> passenger = passengerRepository.findById(passengerId);
        if (passenger.isPresent()) {
            Passenger foundPassenger = passenger.get();
            foundPassenger.setId(newPassenger.getId());
            foundPassenger.setNumber(newPassenger.getNumber());
            foundPassenger.setGender(newPassenger.getGender());
            foundPassenger.setEmail(newPassenger.getEmail());
           //rezervasyon kısmını da getirmeyliz
            foundPassenger.setBirthDate(newPassenger.getBirthDate());


            passengerRepository.save(foundPassenger);
            return foundPassenger;
        } else
            return null;
    }

    public void deleteById(Long passengerId) {
        passengerRepository.deleteById(passengerId);
    }
}