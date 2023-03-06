package com.app.main;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3; 
		int b;
		/*if (a == 3) { 
			b = 2;
		}
		else { 
			b = 4;
		}*/
		//Equivalente al operador ternario
		b = (a==3) ? 2 : 4; //Para TRUE b=2, para FALSE b=4
		System.out.println(b);
	}

}
