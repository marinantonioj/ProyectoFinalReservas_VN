package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Vuelo;

/**
 * 
 * @author Admin
 * @version 1.0.0
 */
public interface VuelosDao extends JpaRepository<Vuelo, Integer> {

	@Query(value = "SELECT v FROM Vuelo v where v.plazasDisponibles >= :plazas")
	List<Vuelo> encontrarVuelosDisponibles(@Param("plazas") int plazas);
	
	@Query(value = "SELECT v FROM Vuelo v where v.idVuelo = :id")
	Vuelo encontrarVuelo(@Param("id") int id);
}
