package com.dhernandez.videojuegos.api.controller;

import com.dhernandez.videojuegos.domain.Videojuego;
import com.dhernandez.videojuegos.service.VideojuegoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ListadoApiController {

    private final VideojuegoService videojuegoService;

    public ListadoApiController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }


    @GetMapping("/videojuegos")
    public List<Videojuego> listarVideojuegos(){
        List<Videojuego> destacados = videojuegoService.buscarDestacatos();
        return  destacados;
    }
}
