package com.arims.repository;

import com.arims.model.Admin;
import com.arims.model.WaterSources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface WaterSourcesRepository extends JpaRepository<WaterSources,Long> {

    void deleteWaterSourcesById(Long id);

    Optional<WaterSources> findWaterSourcesById(Long id);



}
