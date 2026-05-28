package com.distribuida.model;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {
    private Autor autor;

    @BeforeEach
    public void setUp(){
        autor = new Autor(
                1
                ,"Pepe"
                ,"Gonzales"
                ,"Mexico"
                ,"Chihuahua"
                ,"0985431057"
                ,"pepeg@gmail.com"
        );
    }

    @Test
    public void testAutorConstructorAndGetters(){
        assertAll("Pruebas unitarias - Constructor y Getters - Autor",
                () -> assertEquals(1, autor.getIdAutor()),
                () -> assertEquals("Pepe", autor.getNombre()),
                () -> assertEquals("Gonzales", autor.getApellido()),
                () -> assertEquals("Mexico", autor.getPais()),
                () -> assertEquals("Chihuahua", autor.getDireccion()),
                () -> assertEquals("0985431057", autor.getTelefono()),
                () -> assertEquals("pepeg@gmail.com", autor.getCorreo())
        );

    }

}
