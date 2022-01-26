package com.example.demo.servicios;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estacion;
import com.example.demo.repositorio.EstacionRepository;

@Service
public class EstacionServices implements IEstaciones {

	@Autowired
	private EstacionRepository er;

	@Override
	public Estacion crearEstacion(Estacion e) {
		return er.save(e);
	}

	@Override
	public Estacion buscarEstacionporid(Long id) {
		return er.getOne(id);
	}

	@Override
	public void eliminarEstacion(Long id) {
		er.deleteById(id);
		
	}

	@Override
	public List<Estacion> buscarestaciones() {
		return er.findAll();
	}
	


	

}
