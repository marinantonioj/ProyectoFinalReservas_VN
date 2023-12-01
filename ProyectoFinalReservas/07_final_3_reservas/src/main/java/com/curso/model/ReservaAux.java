package com.curso.model;

/**
 * 
 * @author Admin
 * @version 1.0.0
 * En esta clase tenemos representados los datos que recibimos cuando se hace una petición POST con todos los datos
 * de la reserva.
 */
public class ReservaAux {
	private int idVuelo;
	private int idHotel;
	private String nombre;
	private String dni;
	private int numeroPersonas;
	
	public ReservaAux() {
		super();
	}

	/**
	 * 
	 * @param idVuelo
	 * @param idHotel
	 * @param nombre
	 * @param dni
	 * @param numeroPersonas
	 */
	public ReservaAux(int idVuelo, int idHotel, String nombre, String dni, int numeroPersonas) {
		super();
		this.idVuelo = idVuelo;
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.dni = dni;
		this.numeroPersonas = numeroPersonas;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}
	
}
