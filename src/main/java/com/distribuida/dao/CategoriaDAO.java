package com.distribuida.dao;

import com.distribuida.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaDAO extends JpaRepository<Categoria, Integer> {

    List<Categoria> findByCategoria(String categoria);

}