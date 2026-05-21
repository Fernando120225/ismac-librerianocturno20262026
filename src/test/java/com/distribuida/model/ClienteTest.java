package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    private Cliente cliente;



    @BeforeEach
    public void setUp(){
        cliente = new Cliente(
                1
                ,"1755577770"
                ,"Fernando"
                ,"Guayllas"
                ,"Tababela"
                ,"0985431057"
                ,"guayllasjuan7@gmail.com"
        );
    }

    @Test
    public void testClienteConstructorAndGetters(){
        assertAll("Pruebas unitarias - Constructor y Getters - Cliente",
                () -> assertEquals(1, cliente.getIdCliente()),
                () -> assertEquals("1755577770", cliente.getCedula()),
                () -> assertEquals("Fernando", cliente.getNombre()),
                () -> assertEquals("Guayllas", cliente.getApellido()),
                () -> assertEquals("Tababela", cliente.getDireccion()),
                () -> assertEquals("0985431057", cliente.getTelefono()),
                () -> assertEquals("guayllasjuan7@gmail.com", cliente.getCorreo())
        );
        System.out.println(cliente.toString());
    }

    @Test
    public void testClienteSetters(){
        cliente.setIdCliente(2);
        cliente.setCedula("1712345678");
        cliente.setNombre("Juan");
        cliente.setApellido("Guayllas2");
        cliente.setDireccion("Tumbaco");
        cliente.setTelefono("091237896");
        cliente.setCedula("correo@gmail.com");

        assertAll("Pruebas unitarias - Setters - Cliente",
                () -> assertEquals(2,cliente.getIdCliente()),
                () -> assertEquals("1712345678", cliente.getCedula()),
                () -> assertEquals("Juan", cliente.getNombre()),
                () -> assertEquals("Guayllas2", cliente.getApellido()),
                () -> assertEquals("Tumbaco", cliente.getDireccion()),
                () -> assertEquals("091237896", cliente.getCorreo()),
                () -> assertEquals("correo@gmail.com", cliente.getCorreo())
        );
        System.out.println(cliente.toString());
    }
    @Test
    public void testClienteToString(){
        String str = cliente.toString();
        assertAll("Pruebas unitarias - To String - Cliente",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("1712345678")),
                () -> assertTrue(str.contains("Fernando")),
                () -> assertTrue(str.contains("Guayllas")),
                () -> assertTrue(str.contains("Tababela")),
                () -> assertTrue(str.contains("0985431057")),
                () -> assertTrue(str.contains("correogmail.com"))
        );
    }

}
