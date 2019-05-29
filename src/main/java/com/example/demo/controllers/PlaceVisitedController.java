package com.example.demo.controllers;

import com.example.demo.models.PlaceVisited;
import com.example.demo.repository.PlacesVisitedRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class PlaceVisitedController {

    @Autowired
    private PlacesVisitedRepository placesVisitedRepository;

    @RequestMapping(value = "placesVisited", method = RequestMethod.GET)
    public List<PlaceVisited> list()
    {
        return placesVisitedRepository.findAll();
    }

    @RequestMapping(value = "placesVisited/{id}", method = RequestMethod.GET)
    public Optional<PlaceVisited> get(@PathVariable Long id)
    {
        return placesVisitedRepository.findById(id);
    }

    @RequestMapping(value = "placesVisited", method = RequestMethod.POST)
    public PlaceVisited create(@RequestBody PlaceVisited placeVisited)
    {
        return placesVisitedRepository.saveAndFlush(placeVisited);
    }

    @RequestMapping(value = "placesVisited/{id}", method = RequestMethod.PUT)
    public PlaceVisited update(@PathVariable Long id, @RequestBody PlaceVisited updatedPlace)
    {
        Optional<PlaceVisited> existingPlace =placesVisitedRepository.findById(id);
        BeanUtils.copyProperties(updatedPlace, existingPlace.get());
        existingPlace.get().setid(id);
        return placesVisitedRepository.saveAndFlush(existingPlace.get());

    }

    @RequestMapping(value = "placesVisited/{id}", method = RequestMethod.DELETE)
    public PlaceVisited delete(@PathVariable Long id)
    {
        Optional<PlaceVisited> existingPlace = placesVisitedRepository.findById(id);
        placesVisitedRepository.delete(existingPlace.get());
        return existingPlace.get();
    }
}
