package com.arims.repository;

import com.arims.model.Admin;
import com.arims.model.WildlifePp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WildlifePpRepository extends JpaRepository<WildlifePp,Long> {

    void deleteWildlifeById(Long id);

    Optional<WildlifePp> findWildLifeById(Long id);



}
