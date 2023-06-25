package com.dhernandez.videojuegos.api.controller;

import com.dhernandez.videojuegos.domain.Videojuego;
import com.dhernandez.videojuegos.service.VideojuegoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/videojuegos")
public class VideojuegoController {

    private final VideojuegoService videojuegoService;

    public VideojuegoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }


    @GetMapping("")
    public List<Videojuego> listarVideojuegos(){
        List<Videojuego> destacados = videojuegoService.buscarDestacatos();
        return  destacados;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Videojuego> buscarVideojuegos(@PathVariable int id){
        Optional<Videojuego> videojuego = videojuegoService.buscarPorId(id);
        if(videojuego.isPresent()){
            return ResponseEntity.ok(videojuego.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
