package com.arims.service;


import com.arims.exception.UserNotFoundException;
import com.arims.model.Illegals;
import com.arims.repository.IllegalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class IllegalService {

    @Autowired
    private IllegalRepository illegalRepository;


    public Illegals add(Illegals illegals) {
        return illegalRepository.save(illegals);
    }

    public void deleteIllegal(Long id) {
        this.illegalRepository.deleteIllegalById(id);
    }

    public List<Illegals> findAllIllegals() {
        return this.illegalRepository.findAll();
    }

    public Illegals updateIllegals(Illegals illegals) {
        return (Illegals) this.illegalRepository.save(illegals);
    }

    public Illegals findIllegalById(Long id) {
        return (Illegals) this.illegalRepository.findIllegalById(id).orElseThrow(() -> {
            return new UserNotFoundException("Illegal activity unit  by id " + id + " was not found");
        });
    }




}
