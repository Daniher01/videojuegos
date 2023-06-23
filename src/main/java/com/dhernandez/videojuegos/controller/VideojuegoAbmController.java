package com.dhernandez.videojuegos.controller;

import com.dhernandez.videojuegos.domain.Videojuego;
import com.dhernandez.videojuegos.repository.DesarrolladorRepository;
import com.dhernandez.videojuegos.service.DesarrolladorService;
import com.dhernandez.videojuegos.service.DistribuidorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideojuegoAbmController {

    private final DistribuidorService distribuidorService;
    private final DesarrolladorService desarrolladorService;

    public VideojuegoAbmController(DistribuidorService distribuidorService, DesarrolladorService desarrolladorService) {
        this.distribuidorService = distribuidorService;
        this.desarrolladorService = desarrolladorService;
    }

    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("desarrolladores", desarrolladorService.buscarTodos());
        model.addAttribute("videojuego", new Videojuego());
        return "formVideojuego";
    }

    @PostMapping("/videojuegos/guardar")
    public String guardar(Videojuego videojuego){
        System.out.println(videojuego);
        return "redirect:/";
    }
}
