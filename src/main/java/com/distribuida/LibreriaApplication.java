package com.distribuida;

import com.distribuida.model.Autor;
import com.distribuida.model.Categoria;
import com.distribuida.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {

		SpringApplication.run(LibreriaApplication.class, args);
		System.out.println("HOLA MUNDO DESDE SPRING BOOT!!");

		// Prueba con Cliente
		Cliente cliente = new Cliente(
				1,
				"1755577770",
				"Fernando",
				"Guayllas",
				"Tababela",
				"0985431057",
				"jguayllas@tecnologicoismac.edu.ec"
		);
		System.out.println(cliente.toString());

		// Prueba con Autor
		Autor autor = new Autor(
				1,
				"Mishel",
				"Padilla",
				"Ecuador",
				"Aracataca",
				"0999999999",
				"mishelpadilla@ejemplo.com"
		);
		System.out.println(autor.toString());

		// Prueba con Categoria
		Categoria categoria = new Categoria(
				1,
				"Ficción",
				"Libros de historias imaginarias"
		);
		System.out.println(categoria.toString());
	}
}