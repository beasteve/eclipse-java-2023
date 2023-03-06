package com.app.main;

public class Coche extends Vehiclo{
		// atributos especifoicos del Coche
		private float caballos;
		
		public Coche(float velocidad, float caballos, int orientacionRuedas) {
			this.velocidad= velocidad;
			this.asientos = asientos;
			this.orientacionRuedas = orientacionRuedas;
			
			
			// incializacion de los atributos especificos del Coche
			
			this.caballos = caballos;
		}
	}