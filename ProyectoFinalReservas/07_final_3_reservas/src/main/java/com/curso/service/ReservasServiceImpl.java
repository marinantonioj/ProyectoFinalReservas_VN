package com.curso.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ReservasDao;
import com.curso.model.HotelAux;
import com.curso.model.Reserva;
import com.curso.model.ReservaAux;
import com.curso.model.ReservaHotelAux;

/**
 * 
 * @author Admin
 * @version 1.0.0
 * @see ReservasService
 * @see ReservasDao
 */
@Service
public class ReservasServiceImpl implements ReservasService {
	private final String urlVuelos = "http://localhost:8082/vuelos";
	private final String urlHoteles = "http://localhost:8080/hoteles";
	@Autowired
	ReservasDao dao;

	@Autowired
	RestTemplate template;

	/**
	 * @param reservaAux
	 */
	@Override
	public void crearReserva(ReservaAux reservaAux) {
		// registra la reserva. El id se genera automaticamente
		Reserva reserva = new Reserva(reservaAux.getNombre(), reservaAux.getDni(), reservaAux.getIdHotel(), reservaAux.getIdVuelo());
		dao.save(reserva);

		// actualiza las plazas del vuelo
		template.put(urlVuelos + "/" + reservaAux.getIdVuelo() + "/" + reservaAux.getNumeroPersonas(), null);
	}

	/**
	 * @param nombreHotel
	 * @return lista con todas las reservas registradas para ese hotel
	 */
	@Override
	public List<ReservaHotelAux> buscarReservas(String nombreHotel) {
		//obtenemos el id del hotel
		HotelAux hotel = template.getForObject(urlHoteles + "/" + nombreHotel, HotelAux.class);
		int idHotel = hotel.getIdHotel();
		
		//recuperamos todas las reservas de ese hotel
		List<Reserva> lista = dao.buscarReservasHotes(idHotel);
		
		//formateamos el resultado para dar la salida que nos piden
		return obtenerReservasHotel(lista);
	}
	
	/**
	 * 
	 * @param lista
	 * @return listaReservas
	 */
	private List<ReservaHotelAux> obtenerReservasHotel(List<Reserva> lista){
		List<ReservaHotelAux> listaReservas = lista.stream()
				.map(r -> new ReservaHotelAux(r.getNombreCliente(), r.getDni(), r.getIdVuelo()))
				.collect(Collectors.toList());
		return listaReservas;
	}

}
