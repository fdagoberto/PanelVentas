package com.app.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.app.entity.VMonitor;


public interface VMonitorService {

	
	// Recupera la lista completa
	List<VMonitor>obtenerListado();
		
	//Devuelve la venta correspondiente al id si existe
	Optional<VMonitor> obtenerVenta(Integer id);
	
	
	List<VMonitor>obtenerListadoxFecha(LocalDate FechaBusqueda);
	
	

}
