package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.VuelosDao;
import com.curso.model.Vuelo;

/**
 * @author Admin
 * @version 1.0.0
 */
@Service
public class VuelosServiceImpl implements VuelosService {
	
	@Autowired
	VuelosDao dao;

	/**
	 * @param numPlazasReserva son las plazas que queremos reservar
	 * @return lista de vuelos que tengan disponibles al menos el mismo número de plazas que numPlazasReserva 
	 */
	@Override
	public List<Vuelo> obtenerVuelosDisponibles(int numPlazasReserva) {
		return dao.encontrarVuelosDisponibles(numPlazasReserva);
	}

	/**
	 * @param idVuelo
	 * @param plazasReservadas es el número de plazas que queremos reservar en un vuelo
	 */
	@Override
	public void actualizarVuelo(int idVuelo, int plazasReservadas) {
		Vuelo vuelo = dao.encontrarVuelo(idVuelo);
		int plazas = vuelo.getPlazasDisponibles();
		//solo actualizará las plazas. El resto de datos no se pueden tocar
		vuelo.setPlazasDisponibles(plazas-plazasReservadas);
		dao.save(vuelo);

	}

	/**
	 * @param vuelo
	 */
	@Override
	public void insertarVuelo(Vuelo vuelo) {
		dao.save(vuelo);
		
	}

}