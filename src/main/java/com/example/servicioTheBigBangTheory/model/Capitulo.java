package com.example.servicioTheBigBangTheory.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@Entity
public class Capitulo {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private int numero;
    private Double calificacion;

    @ManyToOne
    @JoinColumn(name = "temporada_id")
    private Temporada temporada;
    // Getters y Setters

}

