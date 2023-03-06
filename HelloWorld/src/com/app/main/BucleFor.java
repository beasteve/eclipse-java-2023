package com.app.main;

public class BucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 1;
		int i;
		// comenzando con i=edad, mientras que i sea menor que 18 y con un incremento de
		// i de uno en uno
		for (i = edad; i < 18; i++) {
			System.out.printf("%d", i).println();
		}
		System.out.printf("Programa finalizado --> edad: %d , i: %d", edad, i)
		.println();
		/*
		 * for(int ini=0; ini<100; ini--) { System.out.printf("Hola %d",
		 * ini+1).println(); }
		 */
		System.out.println("Adiós");
		for (int ipar = 0; ipar < 100; ipar++) {
			if (ipar % 2 == 0) {
				System.out.printf("%d es un número par", ipar).println();
			} else {
				System.out.printf("%d es un número impar", ipar).println();
			}
		}
	}

}
