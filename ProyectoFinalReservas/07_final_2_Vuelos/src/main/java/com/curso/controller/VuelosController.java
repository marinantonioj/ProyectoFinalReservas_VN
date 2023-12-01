package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Vuelo;
import com.curso.service.VuelosService;

/**
 * 
 * @author Admin
 * @version 1.0.0
 * @see VuelosService
 */
@RestController
public class VuelosController {

	@Autowired
	VuelosService service;

	// http://localhost:8082/vuelos/{numPlazasDisponibles}
	@GetMapping(value = "vuelos/{numPlazasDisponibles}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> obtenerVuelosDisponibles(@PathVariable("numPlazasDisponibles") int numPlazasDisponibles) {
		return service.obtenerVuelosDisponibles(numPlazasDisponibles);
	}

	// http://localhost:8082/vuelos/{idVuelo}/{plazasReservadas}
	@PutMapping(value = "vuelos/{idVuelo}/{plazasReservadas}")
	public void actualizarVuelo(@PathVariable("idVuelo") int idVuelo,
			@PathVariable("plazasReservadas") int plazasReservadas) {
		service.actualizarVuelo(idVuelo, plazasReservadas);
	}

	// http://localhost:8082/vuelos
	@PostMapping(value = "vuelos")
	public void insertarVuelo(@RequestBody Vuelo vuelo) {
		service.insertarVuelo(vuelo);
	}
}