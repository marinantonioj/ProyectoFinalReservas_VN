package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.ReservaAux;
import com.curso.model.ReservaHotelAux;
import com.curso.service.ReservasService;

/**
 * 
 * @author Admin
 * @version 1.0.0
 * @see ReservasService
 */
@RestController
public class ReservasController {
	@Autowired
	ReservasService service;

	// http://localhost:8083/reservas
	@PostMapping(value = "reservas", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void crearReserva(@RequestBody ReservaAux reserva) {
		service.crearReserva(reserva);
	}

	// http://localhost:8083/reservas/{nombreHotel}
	@GetMapping(value = "reservas/{nombreHotel}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReservaHotelAux> buscarReservas(@PathVariable String nombreHotel) {
		return service.buscarReservas(nombreHotel);
	}
}
