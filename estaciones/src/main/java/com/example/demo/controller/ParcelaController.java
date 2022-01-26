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

import com.example.demo.modelo.Parcela;
import com.example.demo.servicios.IParcela;

@RestController
@RequestMapping("/parcela")
@CrossOrigin(origins = "http://localhost:3000")


public class ParcelaController {

	@Autowired
	private IParcela pe;
	
	@GetMapping("/buscar/{id}")
	public Parcela obtenerparcelabyid(@PathVariable("id") Long id) {
		return pe.buscarParcelaporid(id);
	}
	
	@PostMapping("/crear")
	public Parcela crearParcela(@RequestBody Parcela p) {
		return pe.crearParcela(p);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarParcela(@PathVariable("id")Long id) {
		pe.eliminarparcela(id);
	}
	
	@GetMapping("/buscar/parcelas")
	List<Parcela> buscarparcelas(){
		return pe.buscarparcelas();
	}
	
	
}
