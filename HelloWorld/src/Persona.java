//Convert the Person class to an abstract class and declare an abstract method called showID that must be implemented by the Student and Teacher classes. The showID method should return the student or teacher ID, followed by a hyphen and the average number of students (in the case of the student) or the average number of students (in the case of the teacher).

public abstract class Persona {
    protected int id;
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	protected int edad;
    protected int telefono;

    public Persona(int id, int edad, int telefono) {
        this.id = id;
        this.edad = edad;
    }

    public abstract void mostrarID();
    
    public abstract void mostrarInfo();
    
}

 class Profesor extends Persona {

	public Profesor(int id, int edad, int telefono) {
		super(id, edad, telefono);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarID() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarInfo() {
		// TODO Auto-generated method stub
		
	}
	
}
 
 abstract class Estudiantes extends Persona{

	public Estudiantes(int id, int edad, int telefono) {
		super(id, edad, telefono);
		// TODO Auto-generated constructor stub
	}
	 
 }


