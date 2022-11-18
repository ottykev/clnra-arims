package com.arims.service;

import com.arims.exception.UserNotFoundException;
import com.arims.model.Species;
import com.arims.repository.SpecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecieService {

    @Autowired
    private SpecieRepository specieRepository;


    public Species add(Species species) {
        return specieRepository.save(species);
    }

    public void deleteSpecies(Long id) {
        this.specieRepository.deleteSpecieById(id);
    }

    public List<Species> findAllSpecies() {
        return this.specieRepository.findAll();
    }

    public Species updateSpecies(Species species) {
        return (Species)this.specieRepository.save(species);
    }

    public Species findSpecieById(Long id) {
        return (Species)this.specieRepository.findSpecieById(id).orElseThrow(() -> {
            return new UserNotFoundException("Specy by id " + id + " was not found");
        });
    }




}
