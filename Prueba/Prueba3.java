public class Prueba3 {
	public static void main(String[] args) {
		
		/*
		short edad = 17;

		boolean esMayorDeEdad = (edad >= 18);// !(edad < 18)

		if (esMayorDeEdad){
			System.out.println("\nEdad: " + edad + ". Es mayor de edad");
		} else {
			System.out.println("\nEdad: " + edad + ". No es mayor de edad");
		}

		edad = 18;
		esMayorDeEdad = (edad >= 18);
		if (esMayorDeEdad){
			System.out.println("\nEdad: " + edad + ". Es mayor de edad");
		} else {
			System.out.println("\nEdad: " + edad + ". No es mayor de edad");
		}


		edad = 19;
		esMayorDeEdad = (edad >= 18);
		if (esMayorDeEdad){
			System.out.println("\nEdad: " + edad + ". Es mayor de edad");
		} else {
			System.out.println("\nEdad: " + edad + ". No es mayor de edad");
		} */

		byte mes = 2;
		String nombreMes;

		if(mes < 1 || mes > 12)
			System.out.println("\n\tError, no es un formato de mes v\u00e1lido." + "\n\tIndica un mes del 1 al 12");		
		

		else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			// (mes <= 7 && mes%2 == 1) ||
			// (mes > 7 && mes%2 == 0  ))

		if(mes == 1)
			nombreMes = "enero";
		else if (mes == 3)
			nombreMes = "marzo";
		else if (mes == 5)
			nombreMes = "mayo";
		else if (mes == 7)
			nombreMes = "julio";
		else if (mes == 8)
			nombreMes = "agosto";
		else if (mes == 10)
			nombreMes = "octubre";
		else //if (mes == 12)
			nombreMes = "diciembre";
		

			System.out.println("\n\tEl mes " + nombreMes + " tiene 31 d\u00edas");
			
		}
		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

		if(mes == 4)
			nombreMes = "abril";
		else if (mes == 6)
			nombreMes = "junio";
		else if (mes == 9)
			nombreMes = "septiembre";
		else
			nombreMes = "noviembre";
	
			System.out.println("\n\tEl mes " + nombreMes + " tiene 30 d\u00edas");
		} else {

			nombreMes = "febrero";
			System.out.println("\n\tEl mes " + nombreMes + " tiene 28 d\u00edas, 29 si es bisiesto");
		}

	}	
}