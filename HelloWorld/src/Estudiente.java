public class Estudiente {
	private int id;
	private int edad;
	private int numeroDeNotas;
	private float sumaDeNotas;
	private String notaMedia;
	private int telefono;
    

    public Estudiente() {
        this.notaMedia = "Sin nombre";
        this.edad = 0;
        this.telefono = 393939393;
        this.numeroDeNotas = 32;
        this.sumaDeNotas =23;
        this.notaMedia = "Hola ";
    }

          public static Estudiente nuevoEstudiante() {
            return new Estudiente();
        }
       
    Estudiente estudiante = Estudiente.nuevoEstudiante();
    
    
    }
    


