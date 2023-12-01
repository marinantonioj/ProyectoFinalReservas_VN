package com.curso.service;

import java.util.List;

import com.curso.model.ReservaAux;
import com.curso.model.ReservaHotelAux;

public interface ReservasService {

	//post inserta nueva reserva y actualiza el vuelo con las nuevas plazas
	public void crearReserva(ReservaAux reserva);
	
	//get muestra reservas existentes para un hotel concreto
	public List<ReservaHotelAux> buscarReservas(String nombreHotel);
}
