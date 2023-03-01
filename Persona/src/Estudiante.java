
public class Estudiante extends Persona {
    
    private  int numeroDeNotas;
    private int sumaDeNotas;
    private float notaMdia;

    public Estudiante( ) {
//        super(numeroDeNotas, sumaDeNotas, notaMdia);
        this.numeroDeNotas = numeroDeNotas;
    }

    public  int agregarNuevaNota() {
        return numeroDeNotas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de matrícula: " + numeroDeNotas);
    }
    
    public void  crearEstudiante() {
    	this.
    }
}