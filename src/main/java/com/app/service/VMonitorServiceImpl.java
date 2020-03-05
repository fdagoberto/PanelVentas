package com.app.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.VMonitor;
import com.app.repository.VMonitorRepository;

@Service
public class VMonitorServiceImpl implements VMonitorService{

	
	@Autowired
	private VMonitorRepository vmonitorRepository;
	
	
	@Override
	public List<VMonitor> obtenerListado() {
		// TODO Auto-generated method stub
		//return vmonitorRepository.findAll();
		LocalDate fecha1 = LocalDate.now();
		return vmonitorRepository.findByFecha(fecha1);
		
	}

	
	@Override
	public Optional<VMonitor> obtenerVenta(Integer id) {
		return vmonitorRepository.findById(id);
	}


	@Override
	public List<VMonitor> obtenerListadoxFecha(LocalDate fecha) {
		// TODO Auto-generated method stub
		return vmonitorRepository.findByFecha(fecha);
	}


	


	


	

	
	/*@Override
	public List<VMonitor> ObtenerListadoPorFecha(String fecha) {
		// TODO Auto-generated method stub
		return vmonitorRepository.findByFecha(fecha);
	}*/


	

	
	
}
