package com.arims.repository;

import com.arims.model.Cbo;
import com.arims.model.Fire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FireRepository extends JpaRepository<Fire,Long> {

    void deleteFireById(Long id);

    Optional<Fire> findFireById(Long id);


}
