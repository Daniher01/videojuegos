package com.dhernandez.videojuegos.service;

import com.dhernandez.videojuegos.domain.Distribuidor;
import com.dhernandez.videojuegos.repository.DistribuidorRepository;

import java.util.List;

public class DistribuidorService {

    private final DistribuidorRepository distribuidorRepository;

    public DistribuidorService(DistribuidorRepository distribuidorRepository) {
        this.distribuidorRepository = distribuidorRepository;
    }

    public List<Distribuidor> buscarTodos(){
        return distribuidorRepository.findAll();
    }
}
