package com.app.main;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear una instancia de la clase Scanner pasando System.in al constructor 
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Escribe en pantalla un número: ", keyboard);
		// el programa se detiene en este punto hasta que el usuario introduza un número 		y pulse ENTER
		int numero = keyboard.nextInt();
		//String letra = keyboard.next();
		boolean valors=true;
		
		while(valors) {
			if (numero == 1) {
				System.out.println("Gestores");
				System.out.printf("Escribe en pantalla un número: ", keyboard);
				numero = keyboard.nextInt();
			} else if (numero == 2) {
				System.out.println("Clientes");
				System.out.printf("Escribe en pantalla un número: ", keyboard);
				numero = keyboard.nextInt();
			} else if (numero==3) {
				System.out.println("Transferencias");
				System.out.printf("Escribe en pantalla un número: ", keyboard);
				numero = keyboard.nextInt();
			} else if (numero==4) {
				System.out.println("Mensajes");
				System.out.printf("Escribe en pantalla un número: ", keyboard);
				numero = keyboard.nextInt();
			} else if (numero==5) {
				System.out.println("Préstamos");
				System.out.printf("Escribe en pantalla un número: ", keyboard);
				numero = keyboard.nextInt();
			} else {
				// cerrar la instancia de la clase Scanner 
				keyboard.close();
				valors=false;
				System.out.println("Saliendo del WHILE");
			}	
		}
		System.out.println("Fin del programa (fuera del bucle)");
	}
}
