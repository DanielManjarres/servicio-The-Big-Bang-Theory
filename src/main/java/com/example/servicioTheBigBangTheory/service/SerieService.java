package com.example.servicioTheBigBangTheory.service;

import com.example.servicioTheBigBangTheory.model.Serie;
import com.example.servicioTheBigBangTheory.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SerieService {
    private final SerieRepository serieRepository;

    @Autowired
    public SerieService(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    public Serie getSerieInfo() {
        return serieRepository.findById(1L).orElseThrow(() -> new RuntimeException("Serie no encontrada"));
    }

    public Serie saveSerie(Serie serie) {
        return serieRepository.save(serie);
    }
}
