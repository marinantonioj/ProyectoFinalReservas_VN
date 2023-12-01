package com.curso.service;

import java.util.List;

import com.curso.model.Hotel;

/**
 * 
 * @author Admin
 * @version 1.0.0
 */
public interface HotelesService {
	
	//get lista de hoteles disponibles
	List<Hotel> obtenerHotelesDisponibles();
	
	//get hotel a partir de su nombre
	Hotel obtenerHotelPorNombre(String nombre);
	
	//EXTRA post nuevo hotel
	void crearHotel(Hotel hotel);
	
	
}
