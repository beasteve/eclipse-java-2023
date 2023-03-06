package com.app.main;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Estudiante marc = new Estudiante();
//		Estudiante cristina = new Estudiante(3,41);
//		System.out.println(marc.getEdad());
//		System.out.println(marc.getTelefono());
//		System.out.println(cristina.getEdad());
//		System.out.println(cristina.getId());
//		marc.setEdad(37);
		
		Estudiante jesus = new Estudiante(4);
		System.out.println("Inicialmente");
		System.out.println(jesus.getNumeroNotas());
		System.out.println(jesus.getSumaNotas());
		System.out.println(jesus.getNotaMedia());
		System.out.println(""
				+ "Agregando nueva nota sin valor");
		jesus.agregarNuevaNota();
		System.out.println(jesus.getNumeroNotas());
		System.out.println(jesus.getSumaNotas());
		System.out.println(jesus.getNotaMedia());
		System.out.println(""
				+ "Agregando nueva nota con valor 10 "
				+ "como argumento");
		jesus.agregarNuevaNota(10.0f);
		System.out.println(jesus.getNumeroNotas());
		System.out.println(jesus.getSumaNotas());
		System.out.println(jesus.getNotaMedia());
		System.out.println(""
				+ "Agregando boolean true reiniciaos");
		jesus.agregarNuevaNota(true);
		System.out.println(jesus.getNumeroNotas());
		System.out.println(jesus.getSumaNotas());
		System.out.println(jesus.getNotaMedia());
	}

}
