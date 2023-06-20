/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dhernandez.videojuegos.repository;

import com.dhernandez.videojuegos.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

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
    /** la consultas de JPQL son sobre las clases (en este caso sobre la clase Videojuego y su instancia v **/

    // agregar query nativo de sql
    //@Query(value = "select * from videojuego order by nombre", nativeQuery = true)
    @Query("select v from Videojuego v order by v.nombre")
    List<Videojuego> buscarTodos();

    @Query("from Videojuego v where v.distribuidor.id = ?1 order by v.nombre")
    List<Videojuego> buscarPorDistribuidor(int distribuidorId);

    @Query("from Videojuego v where v.desarrollador.id = ?1 order by v.nombre")
    List<Videojuego> buscarPorDesarrollador(int desarrolladorId);

    @Query("from Videojuego v where v.nombre like %?1% OR v.distribuidor.nombre like %?1% OR v.descripcion like %?1% OR v.desarrollador.nombre like %?1%")
    List<Videojuego> buscar(String consulta);
}
