package com.example.servicioTheBigBangTheory.service;

import com.example.servicioTheBigBangTheory.model.Capitulo;
import com.example.servicioTheBigBangTheory.repository.CapituloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CapituloService {
    private final CapituloRepository capituloRepository;

    @Autowired
    public CapituloService(CapituloRepository capituloRepository) {
        this.capituloRepository = capituloRepository;
    }

    public Optional<Capitulo> findById(Long id) {
        return capituloRepository.findById(id);
    }

    public List<Capitulo> findByTemporadaId(Long temporadaId) {
        return capituloRepository.findByTemporadaId(temporadaId);
    }

    public Capitulo saveCapitulo(Capitulo capitulo) {
        return capituloRepository.save(capitulo);
    }
}
