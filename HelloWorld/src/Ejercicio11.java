import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu	

		        Scanner input = new Scanner(System.in);

		        System.out.print("Ingrese un número entero positivo: ");
		        int num = input.nextInt();

		        boolean primo = true;

		        if (num <= 1) {
		            primo = false;
		        } else {
		            for (int i = 2; i <= num; i++) {
		                if (num % i == 0) {
		                    primo = false;
		                    break;
		                }
		            }
		        }

		        if (primo) {
		            System.out.println(num + " es primo.");
		        } else {
		            System.out.println(num + " no es primo.");
		        }

		    }

		}