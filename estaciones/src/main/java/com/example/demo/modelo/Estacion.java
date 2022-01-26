package com.example.demo.modelo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estaciones")
public class Estacion {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long ide;	

  @Column
  private String nombre_estacion;
  
  @Column
  private String descripcion_estacion;
  
  
  @Column
  private String region;
  
  @Column
  private  String longitude;
  
  @Column
  private String latitude;
  
  
  @Column 
  private String unidad_manejo;
  
  @Column
  private String area;
  

  



@ManyToOne
  @JoinColumn(name="usuario_identificacion", referencedColumnName = "idu")
  private Usuario usuario;



public Estacion() {
	super();
	// TODO Auto-generated constructor stub
}



public long getIde() {
	return ide;
}



public void setIde(long ide) {
	this.ide = ide;
}



public String getNombre_estacion() {
	return nombre_estacion;
}



public void setNombre_estacion(String nombre_estacion) {
	this.nombre_estacion = nombre_estacion;
}



public String getDescripcion_estacion() {
	return descripcion_estacion;
}



public void setDescripcion_estacion(String descripcion_estacion) {
	this.descripcion_estacion = descripcion_estacion;
}



public String getRegion() {
	return region;
}



public void setRegion(String region) {
	this.region = region;
}



public String getLongitude() {
	return longitude;
}



public void setLongitude(String longitude) {
	this.longitude = longitude;
}



public String getLatitude() {
	return latitude;
}



public void setLatitude(String latitude) {
	this.latitude = latitude;
}



public String getUnidad_manejo() {
	return unidad_manejo;
}



public void setUnidad_manejo(String unidad_manejo) {
	this.unidad_manejo = unidad_manejo;
}



public String getArea() {
	return area;
}



public void setArea(String area) {
	this.area = area;
}



public Usuario getUsuario() {
	return usuario;
}



public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}




  
  
}