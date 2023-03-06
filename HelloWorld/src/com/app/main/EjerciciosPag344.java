package com.app.main;

public class EjerciciosPag344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ejercicio: escribe un programa con cuatro variables de tipo entero (a, b, c 		y d) y un condicional que imprima por pantalla si la suma de a y b es mayor 		que la suma de c y d.*/
		int a=1, b=2, c=3, d=4;
		if (a + b > c +d ) {
			System.out.println("La suma de a + b es mayor que c + d");
		} else {
			System.out.println("La suma de c + d es mayor que a + b o iguales");
		}
		//Segundo ejercicio página 344
		int angulo1=90, angulo2=60, angulo3=30;
		int sumAngulos= angulo1+angulo2+angulo3;
		if (sumAngulos==180) {
			System.out.println("Los 3 angulos crean un triangulo");
		} else {
			System.out.println("No suman 180, por lo tanto no es un triangulo");
		}
		
		/*Ejercicio: escribe un programa con una variable de tipo entero (a) y un 		condicional que evalúe si el entero es par o impar utilizando el operador %.*/
		int aeval= 13;
		if (aeval%2==0) {
			System.out.println("Es una cifra par");
		} else {
			System.out.println("Es una cifra impar");
		}
		//Ej página 346
		int i = 25;
		if(i == 25) { 
			System.out.println("a");
		}
		else if(i == 24) { 
			System.out.println("b");
		}
		else { 
			System.out.println("c");
		}
		if(i == 24) { 
			System.out.println("d");
		}
		else { 
			System.out.println("e");
		}
		if(i == 22) { 
			System.out.println("f");
		}
		else if(i == 25) { 
			System.out.println("g");
		}
		else { 
			System.out.println("h");
		}
		System.out.println("Ejercicio Java página 348");
		int num1=4328975, num2=58475, num3=4328974;

		if (num1>num2 && num1>num3) {
			System.out.println("El num1 es el mayor");
		} else {
		    if (num2>num3) {
		    	System.out.println("El num2 es el mayor");
		    } else {
		    	System.out.println("El num3 es el mayor");
		    }
		}
	}
}
