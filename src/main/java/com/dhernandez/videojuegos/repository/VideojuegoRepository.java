/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dhernandez.videojuegos.repository;

import com.dhernandez.videojuegos.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author USUARIO
 * 
 * METODOS UTILES
 * Al extender de la interfaz JpaRepository tenemos
 * accesso a varioa métodos útiles,
 * entre ellos
 * 
 * finadAll()
 * findById()
 * save()
 * detele()
 */
public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {
    
}
