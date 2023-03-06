
public class VariablesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letra1 = "Hola Mundo";
		String letra2 = "Welcome to Barcelona";
		
		if(letra1.length() <= 2 && letra2.length() <= 2) {
			if(letra1.charAt(0) != letra2.charAt(0) && letra1.charAt(1) != letra2.charAt(1) ) {
				System.out.println("Los dos primeros caracteres son iguales.");
			} else {
				System.out.println("Los dos primeros caracteres no son iguales.");
			}
		} else {
			System.out.println("Oh no ! No somos iquales.");
		}
		


	}

}
