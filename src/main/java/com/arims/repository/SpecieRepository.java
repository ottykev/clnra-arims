package com.arims.repository;


import com.arims.model.Admin;
import com.arims.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpecieRepository extends JpaRepository<Species,Long> {

    void deleteSpecieById(Long id);

    Optional<Species> findSpecieById(Long id);
}
