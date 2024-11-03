package com.example.servicioTheBigBangTheory.repository;

import com.example.servicioTheBigBangTheory.model.Capitulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CapituloRepository extends JpaRepository<Capitulo, Long> {
    @Query("SELECT AVG(c.calificacion) FROM Capitulo c WHERE c.temporada.serie.id = :serieId")
    Double findPromedioCalificacionBySerieId(@Param("serieId") Long serieId);
    @Query("SELECT c FROM Capitulo c WHERE c.temporada.serie.id = :serieId ORDER BY c.calificacion DESC")
    List<Capitulo> findTopBySerieIdOrderByCalificacionDesc(@Param("serieId") Long serieId);
    List<Capitulo> findByTemporadaId(Long temporadaId);
}
