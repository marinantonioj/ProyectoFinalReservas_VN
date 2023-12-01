package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Hotel;
import com.curso.service.HotelesService;

/**
 * @author Admin
 * @version 1.0.0
 * @see HotelesService
 */
@RestController
public class HotelesController {
	@Autowired
	HotelesService service;

	// http://localhost:8080/hoteles
	@GetMapping(value = "hoteles", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> obtenerHotelesDisponibles() {
		return service.obtenerHotelesDisponibles();
	}

	// http://localhost:8080/hoteles/{nombre}
	@GetMapping(value = "hoteles/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Hotel obtenerHotelPorNombre(@PathVariable("nombre") String nombre) {
		return service.obtenerHotelPorNombre(nombre);
	}

	// http://localhost:8080/hoteles
	@PostMapping(value = "hoteles", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void crearHotel(@RequestBody Hotel hotel) {
		service.crearHotel(hotel);
	}
}
