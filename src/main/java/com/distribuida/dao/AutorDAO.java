package com.distribuida.dao;

import com.distribuida.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorDAO extends JpaRepository<Autor, Integer> {

    // Ejemplo: buscar autor por nombre
    List<Autor> findByNombre(String nombre);

    // Ejemplo: buscar autor por apellido
    List<Autor> findByApellido(String apellido);
}