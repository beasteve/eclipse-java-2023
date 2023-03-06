package com.app.main;

public class MinFigura {
	public static void main(String[] args) {
		//Instancia rectangulo y uso de area(), dibujar() y getters
		System.out.println("Cálculo del area y dibujando el rectangulo:");
		Rectangulo rectan = new Rectangulo(4);
		System.out.printf("La base es %d y la altura es %d, por lo tanto "
				+ "el area es: ", rectan.getBase(),rectan.getAltura());
		System.out.println(rectan.area());
		rectan.dibujar();
		//Instancia circulo y uso de area() y dibujar()
		System.out.println("Cálculo del area y dibujando el círculo:");
		Circulo circ = new Circulo(5);
		System.out.println(circ.area());
		circ.dibujar();
	}

}
