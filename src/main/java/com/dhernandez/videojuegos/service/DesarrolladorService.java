package com.dhernandez.videojuegos.service;

import com.dhernandez.videojuegos.domain.Desarrollador;
import com.dhernandez.videojuegos.repository.DesarrolladorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesarrolladorService {

    private final DesarrolladorRepository desarrolladorRepository;

    public DesarrolladorService(DesarrolladorRepository desarrolladorRepository) {
        this.desarrolladorRepository = desarrolladorRepository;
    }

    public List<Desarrollador> buscarTodos(){
        return desarrolladorRepository.findAll();
    }
}
