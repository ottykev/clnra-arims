package com.arims.repository;



import com.arims.model.Hwc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HwcRepository extends JpaRepository<Hwc,Long> {


    void deleteHwcById(Long id);

    Optional<Hwc> findHwcById(Long id);




}
