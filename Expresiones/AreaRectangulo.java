/**
*Clase  AreaRectangulo. 
*La f\u00f3rmula del \u00e1rea de un rect\u00e1ngulo es b * h, siendo b la base y h la altura.
*Calcula y muestra el \u00e1rea de un rectá\u00e1ngulo, siendo b=2 y h=7. 
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/

public class AreaRectangulo {
	public static void main (String [] args) {

		byte b = 2; //Declaraci\u00f3 e inicializaci\u00f3n de la variable b, la base.
		byte h = 7; //Declaraci\u00f3 e inicializaci\u00f3n de la variable h, la altura.
		int area = b * h; //Declaraci\u00f3n de la variable \u00e1rea, que se calcula con las anteriores.
		
		System.out.println("\nEl \u00e1rea del rect\u00e1ngulo de base " + b + " y altura " + h + " es igual a " + area);
	
	}
}