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
        System.out.println(autor.toString());
    }

    @Test
    public void testAutorSetters(){
        autor.setIdAutor(2);
        autor.setNombre("Pepe2");
        autor.setApellido("Gonzales2");
        autor.setPais("Mexico2");
        autor.setDireccion("Chihuahua2");
        autor.setTelefono("09854310572");
        autor.setCorreo("pepeg@gmail.com2");

        assertAll("Pruebas unitarias - Setters - Autor",
                () -> assertEquals(2, autor.getIdAutor()),
                () -> assertEquals("Pepe2", autor.getNombre()),
                () -> assertEquals("Gonzales2", autor.getApellido()),
                () -> assertEquals("Mexico2",autor.getPais()),
                () -> assertEquals("Chihuahua2", autor.getDireccion()),
                () -> assertEquals("09854310572",autor.getTelefono()),
                () -> assertEquals("pepeg@gmail.com2", autor.getCorreo())
        );
        System.out.println(autor.toString());
    }
    @Test
    public void testAutorToString(){
        String str = autor.toString();
        assertAll("Pruebas unitarias - To String - Autor",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Pepe")),
                () -> assertTrue(str.contains("Gonzales")),
                () -> assertTrue(str.contains("Mexico")),
                () -> assertTrue(str.contains("Chihuahua")),
                () -> assertTrue(str.contains("0985431057")),
                () -> assertTrue(str.contains("pepeg@gmail.com"))
        );
    }

}
