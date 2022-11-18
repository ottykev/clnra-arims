package com.arims.service;

import com.arims.exception.UserNotFoundException;
import com.arims.model.Admin;
import com.arims.model.Hwc;
import com.arims.repository.AdminRepository;
import com.arims.repository.HwcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HwcService {


    @Autowired
    private HwcRepository hwcRepository;


    public Hwc add(Hwc hwc) {
        return hwcRepository.save(hwc);
    }

    public void deleteConflict(Long id) {
        this.hwcRepository.deleteHwcById(id);
    }

    public List<Hwc> findAllConflicts() {
        return this.hwcRepository.findAll();
    }

    public Hwc updateConflict(Hwc hwc) {
        return (Hwc) this.hwcRepository.save(hwc);
    }

    public Hwc findConflictById(Long id) {
        return (Hwc) this.hwcRepository.findHwcById(id).orElseThrow(() -> {
            return new UserNotFoundException("Conflict by id " + id + " was not found");
        });
    }





}
