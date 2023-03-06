package com.app.main;

public class Try {
	public static void main(string[] args) {
//		// trata de ejecutar el código que se encuentra entre las llaves
//		try {
//		for(int i = -5; i < 5; i++) {
//		int c = 5 / i;
//		System.out.println(c);
//		}
//		}
//		// captura todas las excepciones que puedan producirse
//		catch (Exception e) {
//		// arroja la excepción ArithmeticException, que no es capturada
//		System.out.println(5 / 0);
//		}
//		// este código se ejecuta siempre, se produzca excepción (dentro del bloque try o catch)
////		o no
//		finally {
//		System.out.println("Este código se ejecuta siempre");
//		}
//		// esta línea no se ejecuta porque se produce una excepción no capturada dentro del
////		catch
//		System.out.println("Programa finalizado");
//		
		
		try {
			for(int i = -5; i < 5; i++) {
			int c = 5 / i;
			System.out.println(c);
			}
			}
			// captura cualquier excepción que pueda producirse
			catch (Exception e) {
			e.printStackTrace();
			}
			System.out.println("Programa finalizado");
		
	}

}
