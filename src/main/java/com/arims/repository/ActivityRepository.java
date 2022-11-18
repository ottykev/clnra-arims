package com.arims.repository;

import com.arims.model.Activity;
import com.arims.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActivityRepository extends JpaRepository<Activity,Long> {


    void deleteActivityById(Long id);

    Optional<Activity> findActivityById(Long id);





}
