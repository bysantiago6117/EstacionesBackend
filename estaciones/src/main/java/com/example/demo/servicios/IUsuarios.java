package com.example.demo.servicios;

import java.util.List;
import java.util.Set;

import com.example.demo.modelo.Estacion;
import com.example.demo.modelo.Usuario;


public interface IUsuarios {
     Usuario crearUsuario(Usuario us);
     Usuario buscarUsuarioporid(Long id);
     Usuario actualizarUsuario(Usuario us);
     Set<Estacion> ListarEstacionesbyusuario(Usuario us);
     void eliminarusuario(Long id);
     List<Usuario> buscarusuarios();
     
}
