hez/**
*<h1>Clase MesLargo</h1>
*<ul>Mediante la sentecia if escribe un programa que muestre los siguientes mensajes en funci\u00f3n del contenido de la variable mes:
*	<li>Si es un mes largo, de 31 d\u00edas, que muestre</li>:
*		<ul>
*			<li>El mes de diciembre tiene 31 d\u00edas</li>
*		</ul>
*	<li>Si es un mes corto, de 30 d\u00edas, que muestre</li>
*		<ul>
*			<li>El mes tiene 30 d\u00edas.</li>
*		</ul>
*			<li>Si es febrero, que muestre</li>
*		<ul>
*        	<li>Estamos en febrero. Depende de si es bisiesto o no.</li>
*		</ul>
*	<li>En cualquier otro caso, que muestre:</li>
*		<ul>
*			<li>Mes 0. El mes ha de estar entre 1 y 12... Corrige tu error...</li>
*		</ul>
*</ul>
*@author Guillermo Boquizo S\u00e1nc
*@version 1.0
*
*/
public class MesLargo {
	public static void main(String[] args) {

		byte mes = 13;
		String nombreMes;

		if(mes < 1 || mes > 12)
			System.out.println("\n\tMes 0. El mes ha de estar entre 1 y 12..." + "\n\tCorrige tu error...");

		else if (mes == 2)
			System.out.println("Estamos en febrero. Depende de si es bisiesto o no.");
		

		else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {

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
			else
				nombreMes = "diciembre";
		
			System.out.println("\n\tEl mes " + nombreMes + " tiene 31 d\u00edas.");

		} else {

			System.out.println("\n\tEl mes tiene 30 d\u00edas");
		
		}
	}
}
