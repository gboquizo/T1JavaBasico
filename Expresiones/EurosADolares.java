/**
*Clase EurosADolares. Mirando la tabla de cambios, veo que el euro está a 1,1256 dólares americanos. 
*Mi abuela se dispone a hacer un viaje a LA, California (EEUU). 
*¿Cuántos dólares obtendrá al cambiar 300 Euros?
*
*@author Guillermo Boquizo S\u00e1nchez
*@version 1.0
*
*/
public class EurosADolares  {
	public static void main(String[] args) {
		
		int euros = 300; //Declaraci\u00f3 e inicializaci\u00f3n de la variable euros, los euros
		double valorCambio = 1.1256; //Declaraci\u00f3 e inicializaci\u00f3n de la variable valorCambio, 
                                    //el valor del euro al cambio en d\u00f3lares.
		double dolares = Math.round((euros * valorCambio) * 100) / 100D; //Declaraci\u00f3 e inicializaci\u00f3n de la 
                                                                        //variable dolares, que se calcula con las anteriores

		System.out.println("\n Con " + euros + " euros mi abuela obtendr\u00eda actualmente " + dolares + " d\u00f3lares");

	}
	
}