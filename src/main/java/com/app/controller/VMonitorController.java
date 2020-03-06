package com.app.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.hibernate.hql.internal.ast.tree.IsNullLogicOperatorNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.service.VMonitorService;

@Controller
public class VMonitorController {
	
	
	
	@Autowired
	private VMonitorService vmonitorService;
	
			
	@GetMapping("/PanelVentas")
		public String listar(Model model) {
		model.addAttribute("ventasList", vmonitorService.obtenerListado());
		return "PanelVentas/ventas-view";
	}
	
	
//	@GetMapping("/PanelVentas/{parametro}") 
	@RequestMapping(value = "/PanelVentas", method = RequestMethod.POST)
	  public String listar(
			  @RequestParam("fechaBusqueda") String fechaBusqueda,
	            ModelMap model) {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 
		 		 if (fechaBusqueda=="") {
			 model.addAttribute("ventasList", vmonitorService.obtenerListado());
			return "PanelVentas/ventas-view";
		}
		  //convert String to LocalDate
		 LocalDate localDate = LocalDate.parse(fechaBusqueda, formatter);
		 model.addAttribute("fechaBusqueda", fechaBusqueda);
		 model.addAttribute("ventasList",vmonitorService.obtenerListadoxFecha(localDate));
		 System.out.println(localDate);
	
		 return "PanelVentas/ventas-view";
	        
	}
	

	
		
}

