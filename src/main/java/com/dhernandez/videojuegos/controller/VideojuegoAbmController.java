package com.dhernandez.videojuegos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideojuegoAbmController {

    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta() {
        return "formVideojuego";
    }
}
