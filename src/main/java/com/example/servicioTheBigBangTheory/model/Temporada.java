package com.example.servicioTheBigBangTheory.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@Entity
public class Temporada {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private int anio;

    @ManyToOne
    @JoinColumn(name = "serie_id")
    private Serie serie;
    // Getters y Setters

}
