/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhernandez.videojuegos.service;

import com.dhernandez.videojuegos.domain.Videojuego;
import com.dhernandez.videojuegos.repository.VideojuegoRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author danih
 */
@Service
public class VideojuegoService {
    
    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }

    public List<Videojuego> buscarDestacatos() {

        return videojuegoRepository.buscarTodos();
    }

    public List<Videojuego> buscarPorDistribuidor(int distribuidorId){
        return videojuegoRepository.buscarPorDistribuidor(distribuidorId);
    }

    public List<Videojuego> buscarPorDesarrollador(int desarrolladorId){
        return videojuegoRepository.buscarPorDesarrollador(desarrolladorId);
    }

    public Optional<Videojuego> buscarPorId(int videojuegoId){
        return videojuegoRepository.findById(videojuegoId);
    }

    public List<Videojuego> buscar(String consulta){
        return videojuegoRepository.buscar(consulta);
    }

    public Videojuego guardar (Videojuego videojuego){
        return videojuegoRepository.save(videojuego);
    }

    public void eliminar (int id){
        videojuegoRepository.deleteById(id);
    }
}
