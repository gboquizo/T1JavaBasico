/**
*
*Crea la clase Circulo que 3 veces:
*Solicite el radio de un c\u00edrculo pedirRadio(). Recuerda comprobar que no sea negativo
*Muestre el \u00e1rea calcularArea()
*Muestre el per\u00edmetro calcularPerimetro()
*@author: Guillermo Boquizo S\u00e1nchez
*@version: 1.0
*/
public class Circulo{
	public static void main(String[] args) {
		
		double radio;
		for (int i = 0; i < 3; i++) {
			radio = pedirRadio();
			System.out.println("\n\tEl \u00e1rea del c\u00edrculo de radio " 
				+ Math.round((radio) * 100) / 100d 
				+ " es " + calcularArea(radio));
			System.out.println("\n\tEl per\u00edmetro del c\u00edrculo de radio " 
				+ Math.round((radio) * 100) / 100d 
				+ " es " 
				+ calcularPerimetro(radio));
		}
	}
		
	/**
	* Pide el radio al usuario y lo devuelve para operar con \u00e9l
	*
	*/
	static double pedirRadio() {
		double radio;
		do {

			radio = Teclado.leerDecimal("\n\tIntroduzca el radio: ");

		} while (radio <= 0);

		return radio;
	}
	
	/**	
	* Calcula el \u00e1rea
	* @return el \u00e1rea calculada
	*	
	*/
	static double calcularArea(double radio) {
	
		return Math.round(Math.PI * Math.pow(radio,2) * 1000) / 1000d;
	}
	
	/**
	*Muestra el per\u00edmetro del c\u00edrculo
	*
	* @return el per\u00edmetro del c\u00edrculo
	*/
	static double calcularPerimetro(double radio){
	
		return Math.round((Math.PI * 2 * radio) * 1000) / 1000d;
	}
}