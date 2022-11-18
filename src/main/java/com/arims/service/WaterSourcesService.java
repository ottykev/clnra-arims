package com.arims.service;

import com.arims.exception.UserNotFoundException;
import com.arims.model.Admin;
import com.arims.model.WaterSources;
import com.arims.repository.WaterSourcesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterSourcesService {

    @Autowired
    private WaterSourcesRepository waterSourcesRepository;


    public WaterSources add(WaterSources waterSources) {
        return waterSourcesRepository.save(waterSources);
    }

    public void deleteWaterSources(Long id) {
        this.waterSourcesRepository.deleteWaterSourcesById(id);
    }

    public List<WaterSources> findAllWaterSources() {
        return this.waterSourcesRepository.findAll();
    }

    public WaterSources updateWaterSources(WaterSources waterSources) {
        return (WaterSources) this.waterSourcesRepository.save(waterSources);
    }

    public WaterSources findWaterSourceById(Long id) {
        return (WaterSources) this.waterSourcesRepository.findWaterSourcesById(id).orElseThrow(() -> {
            return new UserNotFoundException(" Water Source by id " + id + " was not found");
        });
    }




}
