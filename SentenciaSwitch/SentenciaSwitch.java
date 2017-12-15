/**
*<h1>Clase SentenciaSwitch</h1>
*<p>Mediante la sentecia switch escribe un programa que muestre los siguientes mensajes en funci\u00f3n 
*<span>del contenido de la variable diaSemana:</p>
*	<ul>
*		<li>Si almacena valores del 1 al 5, que muestre por ejemplo:</li> 
*			<ul>
*				<li>D\u00eda 1, Lunes. A trabajar...</li>
*			</ul>
*		<li>Si almacena lo valores del 6 o 7 que muestre por ejemplo:</li>
*			<ul>
*				<li>D\u00eda 7, Domingo. A descansar...</li>
*			</ul>
*		<li>En cualquier otro caso, que muestre:</li>
*			<ul>
*				<li>D\u00eda 0.  ERROR. Este d\u00eda no existe...</li>
*			</ul>
*	</ul>
*@author Guillermo Boquizo S\u00e1nchez
*@version 1.0
*/
class SentenciaSwitch{
	public static void main (String[] args) {

		String mensaje = "";

		String dia;

		byte diaSemana = 0;

		switch(diaSemana) {

			case 0: dia = ", lunes";
				break;
			case 1: dia = ", martes";
				break;
			case 2: dia = ", mi\u00e9coles";
				break;
			case 3: dia = ", jueves";
				break;
			case 4: dia = ", viernes";
				break;
			case 5: dia = ", s\u00e1bado";
				break;
			default: dia = ", domingo";
				break;
		}

		switch (diaSemana) {

		case 0: //se comienza desde 0 porque as\u00ed lo hace Java.
		case 1:
		case 2:
		case 3:
		case 4:

			mensaje += "\n\tD\u00eda "  + (diaSemana + 1) + dia +  ", a trabajar...";

			break;

		case 5:
		case 6:

			mensaje += "\n\tD\u00eda "  + (diaSemana + 1) + dia + ", a descansar...";

			break;

		default:

			mensaje += "\n\tD\u00eda 0. ERROR. Este d\u00eda no existe...";	
		}
		System.out.println(mensaje);

	}	
}