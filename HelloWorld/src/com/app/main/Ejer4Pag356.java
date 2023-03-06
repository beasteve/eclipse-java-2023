package com.app.main;
import java.util.Scanner;

public class Ejer4Pag356 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Escribe un numero:");
		int numero = keyboard.nextInt();
		int i = 2;

		while(numero % i != 0 && i < numero-1) {
		        i++;
		}

		if (i == numero-1 || numero == 2) {
		    System.out.println("El numero es primo");
		} else if (numero <= 1) {
		    System.out.println("Has puesto un 0, un 1 o un numero negativo");
		} else {
		    System.out.println("El numero no es primo");
		}
		keyboard.close();
	}

}
