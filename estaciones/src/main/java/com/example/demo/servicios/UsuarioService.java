package com.example.demo.servicios;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estacion;
import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.UsuarioReposity;

@Service
public class UsuarioService implements IUsuarios {

	@Autowired
	private UsuarioReposity ur;

	@Override
	public Usuario crearUsuario(Usuario us) {
		return ur.save(us);
	}

	@Override
	public Usuario buscarUsuarioporid(Long id) {
		return ur.getOne(id);
	}

	@Override
	public Usuario actualizarUsuario(Usuario us) {
		return ur.save(us);
	}

	
	@Override
	public void eliminarusuario(Long id) {
		ur.deleteById(id);
		
	}

	@Override
	public List<Usuario> buscarusuarios() {
		
		return ur.findAll();
	}

	@Override
	public Set<Estacion> ListarEstacionesbyusuario(Usuario us) {
		return us.getEstaciones();
	}
	
	
}
