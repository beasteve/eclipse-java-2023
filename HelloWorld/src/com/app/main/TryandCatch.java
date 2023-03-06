package com.app.main;

public class TryandCatch {
	
	public static void main(String[] args) {
		
		try {
			for(int i = -5; i < 5; i++) {
			int c = 5 / i;
			System.out.println(c);
			}
			}
			// captura la excepción de tipo ArithmeticException
			catch (ArithmeticException e) {
			System.out.println("Excepción arimética");
			}
			// captura cualquier otra excepción que pueda producirse
			catch (Exception e) {
			System.out.println("Otro error desconocido");
			}
			System.out.println("Programa finalizado");
			
			
			try {
				for(int i = -5; i<5; i++) {
				int c = 5 / i;
				System.out.println(c);
				}
				}
				// captura todas las excepciones que puedan producirse
				catch (Exception e) {
				System.out.println("Otro tipo de error desconocido");
				}
	}

}
