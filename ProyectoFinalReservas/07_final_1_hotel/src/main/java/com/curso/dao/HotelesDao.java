package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Hotel;

/**
 * 
 * @author Admin
 * @version 1.0.0
 */
public interface HotelesDao extends JpaRepository<Hotel, Integer> {

	@Query(value = "SELECT * FROM hotel h where h.disponible=1", nativeQuery = true)
	List<Hotel> encontrarHotelesDisponibles();
	
	@Query(value = "SELECT h FROM Hotel h where h.nombre=:nombre")
	Hotel encontrarHotelPorNombre(@Param("nombre") String nombre);
}
