package com.app.main;
public class Rectangulo extends Figura implements Dibujable{
	//Constructores
		
	public Rectangulo(int base) {
		super();
		this.base = base;
	}
	//Atributos
		private int base;
		private int altura;
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*altura;
	}
	@Override
	public void dibujar() {
		System.out.println("Dibujando el rectangulo");
	}
	//Getters y setters
	
		public int getBase() {
			return base;
		}
		public void setBase(int base) {
			this.base = base;
		}
		public int getAltura() {
			return altura;
		}
		public void setAltura(int altura) {
			this.altura = altura;
		}

}
