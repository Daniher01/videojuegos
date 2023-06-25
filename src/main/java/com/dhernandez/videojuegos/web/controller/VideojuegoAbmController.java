package com.dhernandez.videojuegos.web.controller;

import com.dhernandez.videojuegos.domain.Videojuego;
import com.dhernandez.videojuegos.repository.DesarrolladorRepository;
import com.dhernandez.videojuegos.service.DesarrolladorService;
import com.dhernandez.videojuegos.service.DistribuidorService;
import com.dhernandez.videojuegos.service.VideojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class VideojuegoAbmController {

    private final DistribuidorService distribuidorService;
    private final DesarrolladorService desarrolladorService;
    private final VideojuegoService videojuegoService;

    public VideojuegoAbmController(DistribuidorService distribuidorService, DesarrolladorService desarrolladorService, VideojuegoService videojuegoService) {
        this.distribuidorService = distribuidorService;
        this.desarrolladorService = desarrolladorService;
        this.videojuegoService = videojuegoService;
    }


    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("desarrolladores", desarrolladorService.buscarTodos());
        model.addAttribute("videojuego", new Videojuego());
        return "formVideojuego";
    }

    @RequestMapping("/videojuegos/actualizar")
    public String mostrarFormUpdate(int videojuegoId, Model model){
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("desarrolladores", desarrolladorService.buscarTodos());
        model.addAttribute("videojuego", videojuegoService.buscarPorId(videojuegoId));
        return "formVideojuego";
    }

    @PostMapping("/videojuegos/guardar")
    public String guardar(Videojuego videojuego){
        videojuegoService.guardar(videojuego);
        return "redirect:/";
    }
}
