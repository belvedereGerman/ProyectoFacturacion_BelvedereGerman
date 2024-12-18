package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Cliente;
import com.coderhouse.models.Producto;

@SpringBootApplication
public class Facturacion  implements CommandLineRunner {

	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(Facturacion.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try {

			Producto producto1 = new Producto("Playstation 5");
			Producto producto2 = new Producto("Lavarropas LG");
			Producto producto3 = new Producto("Aire acondicionado Samsung");
			Producto producto4 = new Producto("Juego FIFA 25");

		    Cliente cliente1 = new Cliente("German", "Belvedere", 11223344);
		    Cliente cliente2 = new Cliente("Mayra", "Barone", 44332211);
		    Cliente cliente3 = new Cliente("Tiziano", "Belvedere", 12345678);
		    Cliente cliente4 = new Cliente("Salvatore", "Barone", 87654321);

			dao.persistirCliente(cliente1);
			dao.persistirCliente(cliente2);
			dao.persistirCliente(cliente3);
			dao.persistirCliente(cliente4);

			dao.persistirProducto(producto1);
			dao.persistirProducto(producto2);
			dao.persistirProducto(producto3);
			dao.persistirProducto(producto4);

		} catch (Exception e) {
			e.printStackTrace(System.err);
		}

	}

}