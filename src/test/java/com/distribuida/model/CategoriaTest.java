package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CategoriaTest {
    private Categoria categoria;

    @BeforeEach
    public void setUp(){
        categoria = new Categoria(
                1
                ,"Terror"
                ,"Historias de terror"
        );
    }

    @Test
    public void testCategoriaConstructorAndGetters(){
        assertAll("Pruebas unitarias - Constructor y Getters - Categoria",
                () -> assertEquals(1, categoria.getIdCategoria()),
                () -> assertEquals("Terror", categoria.getCategoria()),
                () -> assertEquals("Historias de terror", categoria.getDescripcion())
        );
        System.out.println(categoria.toString());
    }

    @Test
    public void testCategoriaSetters(){
        categoria.setIdCategoria(2);
        categoria.setCategoria("Comedia");
        categoria.setDescripcion("Los mejores chistes");

        assertAll("Pruebas unitarias - Setters - Categoria",
                () -> assertEquals(2, categoria.getIdCategoria()),
                () -> assertEquals("Comedia", categoria.getCategoria()),
                () -> assertEquals("Los mejores chistes", categoria.getDescripcion())
        );
        System.out.println(categoria.toString());
    }
    @Test
    public void testCategoriaToString(){
        String str = categoria.toString();
        assertAll("Pruebas unitarias - To String - Categoria",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Terror")),
                () -> assertTrue(str.contains("Historias de terror"))
        );
    }

}

