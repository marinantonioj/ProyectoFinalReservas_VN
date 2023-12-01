package com.curso.service;

import java.util.List;

import com.curso.model.Vuelo;

public interface VuelosService {

	//get vuelos con plazas suficientes
	List<Vuelo> obtenerVuelosDisponibles(int numPlazasReserva);
	
	//put actualiza el vuelo
	void actualizarVuelo(int idVuelo, int plazasReservadas);
	
	//EXTRA inserta un vuelo
	void insertarVuelo(Vuelo vuelo);
}
