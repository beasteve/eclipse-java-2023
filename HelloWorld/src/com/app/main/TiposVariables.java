package com.app.main;

public class TiposVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 5; 
		short s = 128; 
		int i = 40000;
		// en variables de tipo long hay que añadir el carácter L al final del 		número 
		long l = 2222222222L;
		// declaración correcta 
		int j = 2147483647;
		// error porque las variables de tipo int no puede almacenar un 
		// número de esa magnitud
		// int k = 2147483648;
		// long sí admite valores de esta magnitud 
		long longo = 2147483648L;
		// el valor de j es incrementado 
		j = j + 1;
		// el valor de j es ahora -2147483648 
		System.out.println(j);
		double m = 67.0;
		// error porque las variables de tipo float terminan con la letra  f o F 		(una de las dos)
		// float n = 4.0;;
		// declaración correcta de una variable de tipo float 
		float o = 4.0f;
		// declaración correcta de una variable de tipo char 
		char caracter = 'A';
		// error porque char solamente soporta un carácter
		// char cab = 'AB';
		// error porque el carácter debe ir encerrado entre comillas simples
		// char cab = A;
		boolean esVerdadero = true; 
		boolean esFalso = false;
		int a = 4;
		// a = a + 1; 
		a++;
		// 5
		System.out.println(a);
		// 5 (post-incremento: primero se visualiza y luego se incrementa) 
		System.out.println(a++);
		// 6
		System.out.println(a);
		// 7 (pre-incremento: primero se incrementa y luego se visualiza) 
		System.out.println(++a);
		// 7
		System.out.println(a);
		int integer = 100;
		// long > int (conversión automática) 
		long longooo = integer;
		// float > long (conversión automática) 
		float f = integer;
		// 100
		System.out.println(integer);
		// 100
		System.out.println(longooo);
		// 100.0
		System.out.println(f);
		double duble = 100;
		// short < double (casting) 
		short sorto = (short) duble;
		// byte < double (casting) 
		byte biteee = (byte) duble;
		// 100.0
		System.out.println(duble);
		// 100
		System.out.println(sorto);
		// 100
		System.out.println(biteee);
		short n1 = 68;
		char c1 = (char) n1;
		// D
		System.out.println(c1);
		int edad = 20;
		// si edad es igual a 18 
		if (edad == 18) {
			System.out.println("Tengo 18 años");
		}
		System.out.println("Programa finalizado");
		int edad18 = 20;
		// si edad es igual a 18 
		if (edad18 == 18)
		System.out.println("Tengo 18 años"); //Solo esta esta linea en el 		condicional
		System.out.println("Programa finalizado2");
	}

}
