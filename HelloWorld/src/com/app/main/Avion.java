package com.app.main;

public  class Avion extends Vehiclo{
	
	//Constructores
	public Avion() {
		this.trenAterrizaje = true;
	}
	public Avion(boolean trenAterrizaje) {
		this.trenAterrizaje = trenAterrizaje;
	}
	//Atributos
	private boolean trenAterrizaje;
	//Métodos
	public void volar() {}
	public void aterrizaje() {}
	public void parar() {
		System.out.println("Método del avión");
	}
	
	//Getters y setters
	public boolean isTrenAterrizaje() {
		return trenAterrizaje;
	}
	public void setTrenAterrizaje(boolean trenAterrizaje) {
		this.trenAterrizaje = trenAterrizaje;
	}
	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void desacelerar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void girarIzquierda() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void girarDerecha() {
		// TODO Auto-generated method stub
		
	}
	}