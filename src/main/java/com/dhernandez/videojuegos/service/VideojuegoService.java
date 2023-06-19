/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhernandez.videojuegos.service;

import com.dhernandez.videojuegos.domain.Videojuego;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author danih
 */
@Service
public class VideojuegoService {

    public List<Videojuego> buscarDestacatos() {
        List<Videojuego> destacados = new ArrayList<>();

        Videojuego juego = new Videojuego();
        juego.setNombre("Borderlands 3");
        juego.setDescripcion("¡Vuelve el padre de los shooter-looter, con tropecientas mil armas y una aventura caótica!");
        juego.setImagenUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ72eMcYton0nskaJNQo5yIeZF-GWod5qMhRA&usqp=CAU");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("Control");
        juego.setDescripcion("Tras la invasión de una agencia secreta de Nueva York por parte de una amenaza de otro mundo, te conviertes en la nueva directora que deberá luchar para recuperar Control.");
        juego.setImagenUrl("https://media.playstation.com/is/image/SCEA/control-poster-01-ps4-us-11sep19?$native_nt$");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("Subnautica");
        juego.setDescripcion("Un juego de aventuras submarinas ambientado en un mundo oceánico alienígena. ¡Te espera un mundo abierto enorme lleno de maravillas y peligros");
        juego.setImagenUrl("https://store.playstation.com/store/api/chihiro/00_09_000/container/ES/es/999/EP5426-CUSA13893_00-2222444466669999/1568624921000/image?w=240&h=240&bg_color=000000&opacity=100&_version=00_09_000");
        destacados.add(juego);

        juego = new Videojuego();
        juego.setNombre("Firewatch");
        juego.setDescripcion("Firewatch es un juego de misterio en primera persona para un jugador que se desarrolla en la selva de Wyoming");
        juego.setImagenUrl("https://www.mobygames.com/images/covers/l/323028-firewatch-playstation-4-front-cover.jpg");
        destacados.add(juego);

        return destacados;
    }
}
