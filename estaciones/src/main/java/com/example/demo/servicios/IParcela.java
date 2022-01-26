package com.example.demo.servicios;

import java.util.List;

import com.example.demo.modelo.Parcela;


public interface IParcela {
	 Parcela crearParcela(Parcela pa);
     Parcela buscarParcelaporid(Long id);
     void eliminarparcela(Long id);
     List<Parcela> buscarparcelas();
}
