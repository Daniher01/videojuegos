package com.dhernandez.videojuegos.repository;

import com.dhernandez.videojuegos.domain.Desarrollador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesarrolladorRepository extends JpaRepository<Desarrollador, Integer> {
}
