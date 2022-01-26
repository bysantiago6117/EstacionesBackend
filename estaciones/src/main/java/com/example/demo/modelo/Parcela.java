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
@Table(name = "parcelas")
public class Parcela {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long idp;	
 
 @Column
 private String descripcion_parcela;
 
 @Column
 private String latitudp;
 
 @Column
 private String longitudp;
 
 @Column
 private String areap;
 
 
 
 @ManyToOne
 @JoinColumn(name="estacion", referencedColumnName = "ide")
 private Estacion estacion;

public Parcela() {
	super();
	// TODO Auto-generated constructor stub
}

public long getIdp() {
	return idp;
}

public void setIdp(long idp) {
	this.idp = idp;
}

public String getDescripcion_parcela() {
	return descripcion_parcela;
}

public void setDescripcion_parcela(String descripcion_parcela) {
	this.descripcion_parcela = descripcion_parcela;
}

public String getLatitudp() {
	return latitudp;
}

public void setLatitudp(String latitudp) {
	this.latitudp = latitudp;
}

public String getLongitudp() {
	return longitudp;
}

public void setLongitudp(String longitudp) {
	this.longitudp = longitudp;
}

public String getAreap() {
	return areap;
}

public void setAreap(String areap) {
	this.areap = areap;
}

  
 

}
