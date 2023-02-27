
public class ConditionIf {
	
	public static void main(String[] angs) {
		int edad = 18;
	// si edad es menor que 18, y mayor o igual que 0
	if ((edad < 18) && (edad >= 0)) {
	System.out.println("No soy mayor de edad");
	}
	// si no se cumple la condición anterior
	else {
	System.out.println("Soy mayor de edad o no he nacido");

	}
	
	int i = 25;
	if((i < 25) && (i >= 25)) {
	System.out.println("a");
	}
	if((i < 25) || (i >= 25)) {
	System.out.println("b");
	}
}
	
	

}
