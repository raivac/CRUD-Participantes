package com.app.web.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="participantes")
public class Participante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre",nullable = false, length = 25)
	private String nombre;
	
	@Column(name = "apellidos",nullable = false, length = 25)
	private String apellidos;
	
	@Column(name = "club",nullable = false, length = 25)
	private String club;
	
	@Column(name = "poblacion",nullable = false, length = 25)
	private String poblacion;
	
	public Participante(){
		
	}

	public Participante(Long id, String nombre, String apellidos, String club, String poblacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.club = club;
		this.poblacion = poblacion;
	}
	
	public Participante(String nombre, String apellidos, String club, String poblacion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.club = club;
		this.poblacion = poblacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	@Override
	public String toString() {
		return "Participante [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", club=" + club
				+ ", poblacion=" + poblacion + "]";
	}
	
	
}
