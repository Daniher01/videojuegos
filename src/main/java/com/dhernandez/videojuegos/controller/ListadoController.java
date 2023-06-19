/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhernandez.videojuegos.controller;

import com.dhernandez.videojuegos.domain.Videojuego;
import com.dhernandez.videojuegos.service.VideojuegoService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author danih
 */
@Controller
public class ListadoController {
    
    private final VideojuegoService videojuegoService;
    
    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }
    
    @RequestMapping("/")
    public String listarVideojuegos(Model model){
        //busqueda de videojuegos
        List<Videojuego> destacados = videojuegoService.buscarDestacatos();
        model.addAttribute("videojuegos", destacados);
        return("listado");
    }
    
}
