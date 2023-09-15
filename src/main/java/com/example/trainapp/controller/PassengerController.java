package com.example.trainapp.controller;

import com.example.trainapp.entity.Passenger;
import com.example.trainapp.service.PassengerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {
     PassengerService passengerService;

    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @GetMapping
    public List<Passenger> getAllPassengers(){
        return passengerService.getAllPassengers();
    }

    @GetMapping("/{passengerId}")
    public Passenger getOnePassenger(@PathVariable Long passengerId){
        return passengerService.getOnePassenger(passengerId);
    }
    @PutMapping("/{passengerId}")
    public Passenger updateOnePassenger(@PathVariable Long passengerId,
                                        @RequestBody Passenger newPassenger){
        return passengerService.updateOnePassenger(passengerId,newPassenger);
    }
    @PostMapping
    public Passenger createPassenger(@RequestBody Passenger newPassenger){
        return passengerService.saveOnePassenger(newPassenger);
    }
    @DeleteMapping("/{passengerId}")
    public void deleteOnePassenger(@PathVariable Long passengerId){
        passengerService.deleteById(passengerId);
    }
}
