public class Profesor extends Persona {
    private int numeroDeEdadesEstudiantes;
    private int sumaEdadesEstudiants;
    private int estudiantesEdadMedia;

    public Profesor(int numeroDeEdadesEstudiantes, int sumaEdadesEstudiants, int estudiantesEdadMedia) {
        super(numeroDeEdadesEstudiantes, sumaEdadesEstudiants,estudiantesEdadMedia );
        this.numeroDeEdadesEstudiantes = numeroDeEdadesEstudiantes;
    }

    public int getMateria() {
        return numeroDeEdadesEstudiantes;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Materia: " + numeroDeEdadesEstudiantes);
    }
}