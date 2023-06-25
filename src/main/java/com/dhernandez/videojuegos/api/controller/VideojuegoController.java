package com.dhernandez.videojuegos.api.controller;

import com.dhernandez.videojuegos.domain.Videojuego;
import com.dhernandez.videojuegos.service.VideojuegoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("")
    public Videojuego crearVideojuego(@RequestBody Videojuego videojuego){
        return videojuegoService.guardar(videojuego);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Videojuego> actualizarVideojuego(@PathVariable int id, @RequestBody Videojuego videojuego){
        Optional<Videojuego> videojuegoBuscado = videojuegoService.buscarPorId(id);
        if (videojuegoBuscado.isPresent()){
            videojuego.setId(id);
            Videojuego videojuegoActualizado = videojuegoService.guardar(videojuego);
            return ResponseEntity.ok(videojuegoActualizado);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarVideojuego(@PathVariable int id){
        videojuegoService.eliminar(id);
    }
}
