package com.app.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.entity.VMonitor;

@Repository
public interface VMonitorRepository extends JpaRepository<VMonitor,Integer>{
	
	@Query("SELECT t FROM VMonitor t where t.OrdenFch=:fecha")
	public List<VMonitor> findByFecha(@Param("fecha")LocalDate fecha);
	
	
	@Query("SELECT t FROM VMonitor t where t.IdPickeo=:pickeo")
	public List<VMonitor> findByIdPickeo(@Param("pickeo")Long pickeo);	

	
	
}
