/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhernandez.videojuegos.service;

import com.dhernandez.videojuegos.domain.Videojuego;
import com.dhernandez.videojuegos.repository.VideojuegoRepository;
import java.util.ArrayList;
import java.util.List;
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

        return videojuegoRepository.findAll();
    }
}
