package com.arims.service;


import com.arims.exception.UserNotFoundException;
import com.arims.model.Partners;
import com.arims.repository.PartnersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerService {


    @Autowired
    private PartnersRepository partnersRepository;


    public Partners add(Partners partners) {
        return partnersRepository.save(partners);
    }

    public void deletePartners(Long id) {
        this.partnersRepository.deletePartnerById(id);
    }

    public List<Partners> findAllPartners() {
        return this.partnersRepository.findAll();
    }

    public Partners updatePartners(Partners partners) {
        return (Partners) this.partnersRepository.save(partners);
    }

    public Partners findPartnerById(Long id) {
        return (Partners)this.partnersRepository.findPartnersById(id).orElseThrow(() -> {
            return new UserNotFoundException("Partner  by id " + id + " was not found");
        });
    }




}
