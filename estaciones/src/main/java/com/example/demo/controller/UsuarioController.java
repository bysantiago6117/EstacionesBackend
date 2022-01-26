package com.example.demo.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Estacion;
import com.example.demo.modelo.Usuario;
import com.example.demo.servicios.IUsuarios;


@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:3000")
public class UsuarioController {

	@Autowired
	private IUsuarios us; 

	@GetMapping("/buscar/{id}")
	 Usuario  obtenerusuariobyid(@PathVariable("id") Long id) {
		return us.buscarUsuarioporid(id);
	}
	
	@GetMapping("/buscar/usuarios")
	List<Usuario> buscarusuarios(){
		return us.buscarusuarios();
		
	}
	
	@PostMapping("/crear")
	public Usuario crearUsuario(@RequestBody Usuario usu) {
		return us.crearUsuario(usu);
	}
	
	@PutMapping("/actualizar/{id}")
	public Usuario actualizarUsuario(@RequestBody Usuario usu, @PathVariable("id") Long id) {
		Usuario old = us.buscarUsuarioporid(id);
		
		String nombre = usu.getNombre();
		old.setNombre(nombre);
		String contraseña = usu.getContraseña();
		old.setContraseña(contraseña);
		String email = usu.getEmail();
		old.setEmail(email);
		int edad = usu.getEdad();
		old.setEdad(edad);
		String ciudad = usu.getCiudad();
		old.setCiudad(ciudad);
		
	
		
		return us.actualizarUsuario(old);
	}
	
	@GetMapping("/buscar_estaciones/{id}")
	public Set<Estacion> ListarEstacionesbyusuario(Usuario usu){
		return usu.getEstaciones();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarusuario(Long id) {
		us.eliminarusuario(id);
	}
	
	
	
	
	
}
