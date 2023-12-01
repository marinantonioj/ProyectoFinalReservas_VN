package com.curso.model;

/**
 * 
 * @author Admin
 * @version 1.0.0
 * Esta clase representa lo que devuelve reservas al realizarle una petición GET
 */
public class ReservaHotelAux {
	private String nombreCliente;
	private String dni;
	private int idVuelo;
	
	public ReservaHotelAux() {
		super();
	}

	/**
	 * 
	 * @param nombreCliente
	 * @param dni
	 * @param idVuelo
	 */
	public ReservaHotelAux(String nombreCliente, String dni, int idVuelo) {
		super();
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.idVuelo = idVuelo;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
}
