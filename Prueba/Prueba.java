/**
*@author Guillermo Boquizo S\u00e1nchez
*@version 1.0
*
*/
public class Prueba {
	public static void main (String... args) {

		//2017-1986
		// variables locales
		
		/*declaraci\u00f3n
		*int edad;
		*int annoActual;
		*int annoNacimiento;
		*
		*inicializaci\u00f1n
		*annoActual = 2017;
		*annoNacimiento = 1986;
		*edad = annoActual - annoNacimiento;
		*/
		
		//declaraci\u00f1n  e inicializaci\u00f1n
		short annoActual = 2017;
		short annoNacimiento = 1986;
		int edad = annoActual - annoNacimiento;
		char ennie = '\u00f1';
		
		System.out.println("\nMe llamo Guillermo Boquizo S\u00e1nchez.\n"
		+ "\n\tA" + ennie + "o actual: " + annoActual + "." 
		+ "\n\tA" + ennie + "o de nacimiento: " + annoNacimiento + "."
		+ "\n\tEn el " + annoActual  + " cumplo " + edad + " a" + ennie +"os.");
	}
}