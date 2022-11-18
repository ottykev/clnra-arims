package com.arims.service;


import com.arims.exception.UserNotFoundException;
import com.arims.model.Admin;
import com.arims.model.Fire;
import com.arims.repository.FireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FireService {

    @Autowired
    private FireRepository fireRepository;



    public Fire add(Fire fire) {
        return fireRepository.save(fire);
    }

    public void deleteFire(Long id) {
        this.fireRepository.deleteFireById(id);
    }

    public List<Fire> findAllFires() {
        return this.fireRepository.findAll();
    }

    public Fire updateFire(Fire fire) {
        return (Fire)this.fireRepository.save(fire);
    }

    public Fire findFireById(Long id) {
        return (Fire)this.fireRepository.findFireById(id).orElseThrow(() -> {
            return new UserNotFoundException(" FireIncident  by id " + id + " was not found");
        });
    }





}
