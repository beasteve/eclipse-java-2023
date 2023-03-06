package com.app.main;

public class BuclesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 15;
		// mientras que edad sea menor que 18 
		while (edad < 18) {
			System.out.printf("%d", edad).println(); 
			edad++;
		}
		System.out.printf("Programa finalizado --> edad: %d", edad).println();
		
		int edad3 = 16;
		do {
			System.out.printf("%d", edad3).println(); 
			edad3++;
		}while (edad3 < 18); // obligatorio el punto y coma
		
	}

}
