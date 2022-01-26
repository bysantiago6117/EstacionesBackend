package com.example.demo.modelo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table( name = "usuario")
public class Usuario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idu;
	
	@Column
     private String nombre;
	
	@Column
	private String contraseña;
	
	
	@Column
	private String email;
	
	@Column
    private int edad;
	
	@Column
    private String ciudad;
	
	@OneToMany(mappedBy = "usuario")
 	private Set<Estacion> estaciones;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdu() {
		return idu;
	}

	public void setIdu(long idu) {
		this.idu = idu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Set<Estacion> getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(Set<Estacion> estaciones) {
		this.estaciones = estaciones;
	}
	
	
}