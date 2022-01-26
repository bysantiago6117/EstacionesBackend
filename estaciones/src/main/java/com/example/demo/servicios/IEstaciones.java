package com.example.demo.servicios;

import java.util.List;

import com.example.demo.modelo.Estacion;

public interface IEstaciones {
        Estacion crearEstacion(Estacion e);
        Estacion buscarEstacionporid(Long id);
        void eliminarEstacion(Long id);
        List<Estacion> buscarestaciones();
    
}
