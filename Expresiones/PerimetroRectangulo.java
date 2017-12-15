/**
*Clase PerimetroRectangulo. 
*La f\u00f3rmula del per\u00edmetro de un rect\u00e1ngulo es 2*b + 2*h, siendo b la base y h la altura. 
*Calcula y muestra el per\u00edmetro de un rect\u00e1ngulo, siendo b=2 y h=7. 
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/

public class PerimetroRectangulo {
	public static void main (String [] args) {
		
		byte b = 2; //Declaraci\u00f3 e inicializaci\u00f3n de la variable b, la base.
		byte h = 7; //Declaraci\u00f3 e inicializaci\u00f3n de la variable h, la altura.
		int perimetro = 2 * b + 2 * h; //Declaraci\u00f3n de la variable per\u00edmetro, 
                                      //que se calcula con las anteriores.
		
		System.out.println("\nEl per\u00edmetro del rect\u00e1ngulo de base " + b + " y altura " + h + " es igual a " + perimetro); //Salida est\u00e1ndar. 

		
	}
}