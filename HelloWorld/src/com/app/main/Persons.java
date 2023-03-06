package com.app.main;
public class Persons implements PersonInterface{
	
	
	private int edad;
	private int telefono;
	private int id;
	/**
	 * @param id
	 * @param edad
	 * @param telefono
	 */
	public Persons(int id, int edad, int telefono) {
		super();
		this.id = id;
		this.edad = edad;
		this.telefono = telefono;
	}

	

	
	public int getEdad() {
		return edad;
	}




	public void setEdad(int edad) {
		this.edad = edad;
	}




	public int getTelefono() {
		return telefono;
	}




	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Persons() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void mostrarID() {
		// TODO Auto-generated method stub
		
	}
}