package com.arims.repository;

import com.arims.model.Activity;
import com.arims.model.Partners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PartnersRepository extends JpaRepository<Partners,Long> {

    void deletePartnerById(Long id);

    Optional<Partners> findPartnersById(Long id);


}
