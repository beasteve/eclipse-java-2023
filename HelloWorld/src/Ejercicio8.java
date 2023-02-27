import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		implements a program that asks the user to enter a number
//		on the screen and, based on the number entered, displays the
//		following message for each number
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Escribe en patalla un numero:  ", input);
		int numero = input.nextInt();
		
		
		
		switch(numero) {
        case 1:
            System.out.println("--> Gestores");
           
            break;
        case 2:
            System.out.println("2 --> Clientes");
            break;
        case 3:
            System.out.println("--> Transferencias");
            break;
        case 4:
            System.out.println("--> Mensajes");
            break;
        case 5:
            System.out.println("--> Préstamos");
            break;
        default:
            System.out.println("-->Salir");
    }
		
		
//		Scanner message = new Scanner(System.in);
//		int numeros = message.nextInt();
//		
//		if(numeros == 0) {
//			
//		}
//		else if(numeros> 9) {
//			
//		}
//		else {
//			System.out.printf("Not ");
//		}
	}

}
