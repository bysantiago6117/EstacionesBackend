package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Estacion;
import com.example.demo.servicios.IEstaciones;

@RestController
@RequestMapping("/estacion")
@CrossOrigin(origins = "http://localhost:3000")
public class EstacionController {

	@Autowired
	private IEstaciones ie;
	
	@GetMapping("/buscar/{id}")
	 public Estacion obtenerEstacionbyid(@PathVariable("id") Long id) {
		return ie.buscarEstacionporid(id);
	}
	
	
	@PostMapping("/crear")
	public Estacion crearEstacion(@RequestBody Estacion es) {
		return ie.crearEstacion(es);
	}
	
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarEstacion(@PathVariable("id")Long id) {
		ie.eliminarEstacion(id);
	}
	
	@GetMapping("/buscar/estaciones")
	List<Estacion> buscarestaciones(){
		return ie.buscarestaciones();
	}
	
	
}