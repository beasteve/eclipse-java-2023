package com.app.main;

public class Circulo extends Figura implements Dibujable {

	//Constructores
		public Circulo() {
			super();
		}
	
	public Circulo(float radio) {
		super();
		// TODO Auto-generated constructor stub
		this.radio = radio;
	}

	// Attribute
	private float radio;
	
	
	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public void dibajar() {
		// TODO Auto-generated method stub
		System.out.println("Dibujando el círculo");
	}

	

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi * Math.pow(radio, 2);
	}



}
