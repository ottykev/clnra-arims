package com.arims.service;

import com.arims.exception.UserNotFoundException;
import com.arims.model.Admin;
import com.arims.model.WildlifePp;
import com.arims.repository.WildlifePpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WildlifePpService {

    @Autowired
    private WildlifePpRepository wildlifePpRepository;


    public WildlifePp add(WildlifePp wildlifePp) {
        return wildlifePpRepository.save(wildlifePp);
    }

    public void deleteWildlifePp(Long id) {
        this.wildlifePpRepository.deleteWildlifeById(id);
    }

    public List<WildlifePp> findAllWildlife() {
        return this.wildlifePpRepository.findAll();
    }

    public WildlifePp updateWildlife(WildlifePp wildlifePp) {
        return (WildlifePp) this.wildlifePpRepository.save(wildlifePp);
    }

    public WildlifePp findWildlifeById(Long id) {
        return (WildlifePp) this.wildlifePpRepository.findWildLifeById(id).orElseThrow(() -> {
            return new UserNotFoundException("WildLife by id " + id + " was not found");
        });
    }


}
