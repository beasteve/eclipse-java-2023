package com.app.main;

public class BucleBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		// bucle infinito 
		while(true) {
			a++;
			if (a == 600000) {
				// finaliza el while 
				break;
			}
		}
		System.out.println("Finalizado");
	}

}
