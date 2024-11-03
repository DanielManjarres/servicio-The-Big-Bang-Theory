package com.example.servicioTheBigBangTheory.repository;

import com.example.servicioTheBigBangTheory.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
    // Puedes agregar métodos personalizados si necesitas búsquedas específicas
}
