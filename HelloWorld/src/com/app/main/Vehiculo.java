package com.app.main;

public abstract class Vehiculo {
	//Atributos
	protected float velocidad;
	protected int asientos;
	protected int ruedas;
	//Métodos
	public abstract void parar();
	
	public void acelerar() {}
	public void desacelerar() {}
	public void girarIzquierda() {}
	public void girarDerecha() {}
}
