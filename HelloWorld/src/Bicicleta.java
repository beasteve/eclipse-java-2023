
public class Bicicleta extends Vehiclo{
	
	private int cambios;
	
	public int getCambios() {
		return cambios;
	}

	public void setCambios(int cambios) {
		this.cambios = cambios;
	}
	// Contructores
	public Bicicleta(int cambios) {
		this.cambios = cambios;
	}

	public Bicicleta() {
		this.cambios = 5;
		System.out.println("Contstructor de la clase hija");
	}

}
