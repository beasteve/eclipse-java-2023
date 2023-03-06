package com.app.main;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] resps = {"Gestores", "Clientes", "Transferencias", "Mensajes", "Préstamos", "Salir"};
        boolean online = true;

        while ( online ) {
            System.out.println("\n---\n1. Gestores\n2. Clientes\n3. Transferencias\n4. Mensajes\n5. Préstamos\n6. Salir\n---");

            Scanner keyboard = new Scanner(System.in);
            System.out.printf("Decime un número: ", keyboard);

            int numero = keyboard.nextInt();

            if (numero > resps.length) {
                System.out.printf("Decime otro número: ", keyboard);
                numero = keyboard.nextInt();
            }

            if (numero < resps.length) {
                System.out.println(resps[numero-1]);
            }

            if ( numero == resps.length ) {
                keyboard.close();
                online = false;
                System.out.println("Fin del programa");
            }
        }
	}

}
