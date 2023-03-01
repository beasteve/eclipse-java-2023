public class Persona {
	
	//Atrubutos
    private int id;
    private int edad;
    private int telefono;
    
    //Metodos
    public void monstraInfo(){}

    public Persona(int id,int telefono,  int edad) {
        this.id = id;
        this.edad = edad;
        this.telefono = telefono;
    }

   

    public int getEdad() {
        return edad;
    }
    
    public int getId() {
        return id;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public void mostrarInfo() {
        System.out.println("Id: " + id);
        System.out.println("Edad: " + edad);
    }
}


