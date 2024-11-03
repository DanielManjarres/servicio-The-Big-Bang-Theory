package com.example.servicioTheBigBangTheory.controller;

import com.example.servicioTheBigBangTheory.model.Capitulo;
import com.example.servicioTheBigBangTheory.model.Serie;
import com.example.servicioTheBigBangTheory.model.dto.SerieDetalleDTO;
import com.example.servicioTheBigBangTheory.repository.CapituloRepository;
import com.example.servicioTheBigBangTheory.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/serie")
public class SerieController {

    @Autowired
    private SerieRepository serieRepository;

    @Autowired
    private CapituloRepository capituloRepository;

    @GetMapping("/{id}/detalle")
    public ResponseEntity<SerieDetalleDTO> getSerieDetalleById(@PathVariable Long id) {
        Optional<Serie> serieOptional = serieRepository.findById(id);

        if (serieOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Serie serie = serieOptional.get();

        // Calcular el promedio de calificación de los capítulos
        Double promedioCalificacion = capituloRepository.findPromedioCalificacionBySerieId(id);

        // Encontrar el capítulo mejor calificado
        List<Capitulo> capitulos = capituloRepository.findTopBySerieIdOrderByCalificacionDesc(id);
        Capitulo mejorCapitulo = capitulos.isEmpty() ? null : capitulos.get(0);

        SerieDetalleDTO serieDetalle = new SerieDetalleDTO(
                serie.getNombre(),
                serie.getCreador(),
                serie.getClasificacion(),
                promedioCalificacion,
                mejorCapitulo.getNombre(),
                mejorCapitulo.getCalificacion(),
                serie.getDescripcion()
        );

        return ResponseEntity.ok(serieDetalle);
    }
}
