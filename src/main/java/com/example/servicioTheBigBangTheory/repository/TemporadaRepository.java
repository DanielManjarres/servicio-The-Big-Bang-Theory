package com.example.servicioTheBigBangTheory.repository;

import com.example.servicioTheBigBangTheory.model.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemporadaRepository extends JpaRepository<Temporada, Long> {
    // Método personalizado para obtener temporadas por ID de serie
    List<Temporada> findBySerieId(Long serieId);
}
