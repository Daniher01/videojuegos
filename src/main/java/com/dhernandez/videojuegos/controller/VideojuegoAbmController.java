package com.dhernandez.videojuegos.controller;

import com.dhernandez.videojuegos.service.DistribuidorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideojuegoAbmController {

    private final DistribuidorService distribuidorService;

    public VideojuegoAbmController(DistribuidorService distribuidorService) {
        this.distribuidorService = distribuidorService;
    }

    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("distribuciones", distribuidorService.buscarTodos());
        return "formVideojuego";
    }
}
