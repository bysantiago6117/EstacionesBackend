package com.example.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Parcela;
import com.example.demo.repositorio.ParcelaReposity;


@Service
public class ParcelaServices implements IParcela{

	@Autowired
	private ParcelaReposity p;

	@Override
	public Parcela crearParcela(Parcela pa) {
		return p.save(pa);
	}

	@Override
	public Parcela buscarParcelaporid(Long id) {
		return p.getOne(id);
	}

	@Override
	public void eliminarparcela(Long id) {
		p.deleteById(id);
		
	}

	@Override
	public List<Parcela> buscarparcelas() {
		return p.findAll();
	}


	
	
	


}
