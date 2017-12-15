/**
*Clase AreaCirculo. La f\u00f3rmula del \u00e1rea un c\u00edrculo es pi*r2, siendo r el radio del c\u00edrculo.
*Calcula y muestra el \u00e1rea de un c\u00edrculo cuyo r=7. 
*@author Guillermo Boquizo S\u00e1nchez
*@version 1.0
*/

public class AreaCirculo {
	public static void main(String[] args) {
		
		byte r = 7; //Declaraci\u00f3 e inicializaci\u00f3n de la variable r, el radio
        double pi = Math.PI; //Declaraci\u00f3 e inicializaci\u00f3n de la variable pi, n\u00famero pi
		double area = Math.round((pi * Math.pow (r,2)) * 100) / 100D; //Declaraci\u00f3n de la variable \u00e1rea, 
                                                             //que se calcula con las anteriores
		System.out.println("\nEl \u00e1rea del c\u00edrculo de radio " + r + " es igual a " + area);

	}
}