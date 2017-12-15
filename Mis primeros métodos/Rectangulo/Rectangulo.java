/**
*Crea la clase Rect\u00e1ngulo que repita n veces (indicadas por usuario):
*Solicite la base de un rect\u00e1ngulo pedirBase()-> pedirDimension(String mensaje)
*Solicite la altura de un rect\u00e1ngulo pedirAltura() -> pedirDimension(String mensaje)
*Muestre el \u00e1rea calcularArea()
*Muestre el per\u00edmetro calcularPerimetro()
*@author: Guillermo Boquizo S\u00e1nchez
*@version: 1.0
*/
 public class Rectangulo {
	public static void main(String[] args) {
		double base, altura;
		int numVeces = pedirEntero();

		for (int i = 0; i < numVeces; i++) {
			base = pedirBase();
			altura = pedirAltura();
			System.out.println("\n\tEl \u00e1rea del rect\u00e1ngulo de base "
				+ Math.round((base) * 100) / 100d  
				+ " y altura " 
				+ Math.round((altura) * 100) / 100d 
				+ " es " + calcularArea(base,altura) 
				+ "\n\n\tSu per\u00edmetro es "
				+ calcularPerimetro(base,altura) + "\n");
		}
	}
	
	

	/**
	*Calcula el per\u00edmetro
	*@return el per\u00edmetro calculado
	*
	*/
	private static double calcularPerimetro(double base,double altura) {

		return Math.round((2 * base + 2 * altura) * 100) /100d;

	}

	/**
	*Calcula el \u00e1rea
	*@return el \u00e1rea calculada
	*
	*/
	private static double calcularArea(double base,double altura) {

		return Math.round((base * altura) * 100) /100d;

	}
		
	
	/**
	* Solicita la base al usuario y devuelve una base v\u00e1lida
	*@return la base v\u00e1lida
	*
	*/
	private static double pedirBase() {

		return pedirDimension("\n\tDame la base del rect\u00e1ngulo: ");
	}
	
	/**
	* Solicita la altura al usuario y devuelve una altura v\u00e1lida
	* @return la altura v\u00e1lida
	*
	*/
	private static double pedirAltura() {

		return pedirDimension("\n\tDame la altura del rect\u00e1ngulo: ");
	}
	
	/**
	* Solicita la dimensi\u00f3n al usuario y devuelve una dimensi\u00f3n v\u00e1lida
	*@return una dimensi\u00f3n v\u00e1lida
	*
	*/
	private static double pedirDimension(String mensaje) {
		double dimension;

		do {
			dimension = Teclado.leerDecimal(mensaje);
		} while (dimension <= 0);

		return dimension;
	}
	
	/**
	* Solicita un entero positivo al usuario y lo devuelve
	*@return un entero positivo
	*
	*/
	private static int pedirEntero() {
		int entero;
		do {
			entero = Teclado.leerEntero("\nDame las veces que quieres realizar el ejercicio: ");
		} while (entero <= 0);

		return entero;
	}
}