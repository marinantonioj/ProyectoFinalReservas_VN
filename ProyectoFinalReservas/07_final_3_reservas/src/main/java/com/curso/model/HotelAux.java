package com.curso.model;

/**
 * 
 * @author Admin
 * @version 1.0.0
 * Clase auxiliar para soportar el objeto de tipo "Hotel"
 */
public class HotelAux {
	private int idHotel;
	private String nombre;
	private int categoria;
	private double precio;
	private boolean disponible;

	public HotelAux() {
		super();
	}

	/**
	 * 
	 * @param idHotel
	 * @param nombre
	 * @param categoria
	 * @param precio
	 * @param disponible
	 */
	public HotelAux(int idHotel, String nombre, int categoria, double precio, boolean disponible) {
		super();
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
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

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
