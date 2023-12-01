package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.HotelesDao;
import com.curso.model.Hotel;

/**
 * 
 * @author Admin
 * @version 1.0.0
 * @see HotelesService
 * @see HotelesDao
 */

@Service
public class HotelesServiceImpl implements HotelesService {
	
	@Autowired
	HotelesDao dao;

	/**
	 * @return lista de hoteles que se encuentran disponibles
	 */
	@Override
	public List<Hotel> obtenerHotelesDisponibles() {
		return dao.encontrarHotelesDisponibles();
	}

	/**
	 * @param nombre
	 * @return todos los datos del hotel en forma de objeto Hotel
	 */
	@Override
	public Hotel obtenerHotelPorNombre(String nombre) {
		return dao.encontrarHotelPorNombre(nombre);
	}

	/**
	 * @param hotel
	 */
	@Override
	public void crearHotel(Hotel hotel) {
		dao.save(hotel);
		
	}

}
