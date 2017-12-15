/**
*Clase CelsiusAFarenheit
*En los EEUU sigue utiliz\u00e1ndose los grados Farenheit para la medici\u00f3n de la temperatura.
*Calcula cu\u00e1ntos grados Farenheit son los puntos de ebullici\u00f3n (100 grados Celsius) y de congelaci\u00f3n (0 grados Celsius).
*
*@author Guillermo Boquizo S\u00e1nchez
*@version 1.0
*
*/

public class CelsiusAFarenheit {
	public static void main(String[] args) {
		
		double congelacion = (9.0/5.0 * 0) + 32; //Declaraci\u00f3 e inicializaci\u00f3n de la variable congelacion,
                                                //el punto de congelaci\u00f3n.
		double ebullicion = (9.0/5.0 * 100) + 32; //Declaraci\u00f3 e inicializaci\u00f3n de la variable ebullici\u00f3n,
                                                 //el punto de ebullici\u00f3n.
		int resultadoCongelacion = (int) congelacion; //Declaraci\u00f3 e inicializaci\u00f3n de la variable
                                                     //resultadoCongelacion, el resultado pasado a entero.
		int resultadoEbullicion = (int) ebullicion; //Declaraci\u00f3 e inicializaci\u00f3n de la variable 
                                                   //resultadoEbullicion, el resultado pasado a entero.

		System.out.println("\n El punto de congelaci\u00f3n, 0\u00b0 Celsius, equivale a " + resultadoCongelacion + "\u00b0 Farenheit");
		System.out.println("\n El punto de ebullici\u00f3n, 100\u00b0 Celsius, equivale a " + resultadoEbullicion + "\u00b0 Farenheit");
	}
}