package com.example.trainapp.repos;

import com.example.trainapp.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
   // Passenger findByUsername(String username);
}
