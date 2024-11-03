package com.example.servicioTheBigBangTheory.service;

import com.example.servicioTheBigBangTheory.model.Temporada;
import com.example.servicioTheBigBangTheory.repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TemporadaService {
    private final TemporadaRepository temporadaRepository;

    @Autowired
    public TemporadaService(TemporadaRepository temporadaRepository) {
        this.temporadaRepository = temporadaRepository;
    }

    public List<Temporada> findAll() {
        return temporadaRepository.findAll();
    }

    public Optional<Temporada> findById(Long id) {
        return temporadaRepository.findById(id);
    }

    public List<Temporada> findBySerieId(Long serieId) {
        return temporadaRepository.findBySerieId(serieId);
    }

    public Temporada saveTemporada(Temporada temporada) {
        return temporadaRepository.save(temporada);
    }
}
