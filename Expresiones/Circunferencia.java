/**
*Clase  Circunferencia. 
*La f\u00f3rmula de la circunferencia de un c\u00edrculo es 2*pi*r, siendo r el radio del c\u00edrculo. 
*Calcula y muestra la circunferencia de un c\u00edrculo, siendo r=7. 
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/

public class Circunferencia {
	public static void main(String[] args) {
		
		byte r = 7; //Declaraci\u00f3 e inicializaci\u00f3n de la variable r, el radio.
        double pi = Math.PI; //Declaraci\u00f3 e inicializaci\u00f3n de la variable pi, n\u00famero pi.
		double circunferencia = Math.round((2 * pi * r) * 100) / 100D; //Declaraci\u00f3 e inicializaci\u00f3n 
                                                                      //de la variable   pi, n\u00famero pi.

		System.out.println("\nLa circunferencia de un c\u00edrculo de radio " + r + " es igual a " + circunferencia);

	}
}