package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.PlaceVisited;

public interface PlacesVisitedRepository extends JpaRepository<PlaceVisited, Long> {

}
