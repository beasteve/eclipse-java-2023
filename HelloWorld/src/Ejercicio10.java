
import java.util.Scanner;
public class Ejercicio10 {



	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Ingresa un número entero positivo: ");
	        int num = input.nextInt();

	        int suma = 0;
	        for (int i = num; i > 0; i--) {
	            suma += i;
	        }

	        System.out.println("La suma de " + num + " y todos sus anteriores es: " + suma);
	    }
	    
	}


