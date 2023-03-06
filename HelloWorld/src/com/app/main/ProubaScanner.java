package com.app.main;
import java.util.Scanner;


public class ProubaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner keyboard = new Scanner(System.in);
//		System.out.printf("Escribe en patalla un numero", keyboard);
//		int numero = keyboard.nextInt();
		
//		keyboard.close();
		
		// crear una instancia de la clase Scanner pasando System.in al constructor
		/* Scanner keyboard = new Scanner(System.in); */
		// el programa se detiene en este punto hasta que el usuario introduza un número y
		//pulse ENTER
		/*int numero = keyboard.nextInt(); */
		// cerrar la instancia de la clase Scanner
		/* keyboard.close(); */
		
		for(int i=0; i<100; i++) {
			if (i % 2 == 0) {
			System.out.printf("%d es un número par", i).println();
			}
			}

	}

}
