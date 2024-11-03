package com.example.servicioTheBigBangTheory.controller;

import com.example.servicioTheBigBangTheory.model.Capitulo;
import com.example.servicioTheBigBangTheory.repository.CapituloRepository;
import com.example.servicioTheBigBangTheory.service.CapituloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/capitulos")
public class CapituloController {

    @Autowired
    private CapituloRepository capituloRepository;

    // Obtener todos los capítulos
    @GetMapping
    public List<Capitulo> getAllCapitulos() {
        return capituloRepository.findAll();
    }

    // Obtener un capítulo por ID
    @GetMapping("/{id}")
    public ResponseEntity<Capitulo> getCapituloById(@PathVariable Long id) {
        Optional<Capitulo> capitulo = capituloRepository.findById(id);
        return capitulo.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // Obtener todos los capítulos de una temporada específica
    @GetMapping("/temporada/{temporadaId}")
    public List<Capitulo> getCapitulosByTemporadaId(@PathVariable Long temporadaId) {
        return capituloRepository.findByTemporadaId(temporadaId);
    }
}

