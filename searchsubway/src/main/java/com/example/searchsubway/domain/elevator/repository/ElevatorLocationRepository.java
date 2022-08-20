package com.example.searchsubway.domain.elevator.repository;

import com.example.searchsubway.domain.elevator.ElevatorLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElevatorLocationRepository extends JpaRepository<ElevatorLocation,Long>, ElevatorLocationCustomRepository {

}
