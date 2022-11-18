package com.arims.repository;

import com.arims.model.Admin;
import com.arims.model.Illegals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IllegalRepository extends JpaRepository<Illegals,Long> {

    void deleteIllegalById(Long id);

    Optional<Illegals> findIllegalById(Long id);


}
