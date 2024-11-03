package com.example.servicioTheBigBangTheory.repository;

import com.example.servicioTheBigBangTheory.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {
}
