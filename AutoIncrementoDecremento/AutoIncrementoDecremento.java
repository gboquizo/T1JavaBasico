/**
*Entrega el siguiente c\u00f3digo fuente en java. 
*A\u00f1\u00e1dele comentarios justificando los resultados.
*
*
*@author Guillermo Boquizo S\u00e1nchez
*@version 1.0
*
*/
public class AutoIncrementoDecremento {
	public static void main(String[] args) {

		int i = 1;
		System.out.println(" i : " + i) ; 	   		       //Se est\u00e1 asignando la variable, el valor que imprime es 1

		System.out.println("++i : " + ++i);  	            /*En esta l\u00ednea se est\u00e1 usando el operador ++ como prefijo para incrementar en 1 
		  												    *el valor dado a 'i', 
										   	 	            *asignando posteriormente ese valor a '++i', el valor que imprime en este caso es 2
										   	 	            */

		System.out.println("i++ : " + i++);	                /*En esta l\u00ednea, al usarse en su forma de sufijo 'i++', el valor de ‘i’ se incrementa 
										   		             *solamente despu\u00e9s de que el valor actual de ‘i’ haya sido utilizado en expresión, 
										   		             *esto es, primero se asigna 'i' a 'i++' y despu\u00e9s se incrementa el valor de 'i'. 
												             *El valor que imprime es igualmente 2
												             */

		System.out.println(" i : " + i);	                /*Como el valor de 'i' se ha visto incrementado tras su asignaci\u00f3n a 'i++', en este caso 
											                 *el valor de 'i'que se imprime es 3
											                 */

		System.out.println("--i : " + --i);                 /*En esta l\u00ednea se est\u00e1 usando el operador -- como prefijo para decrecer 
															 *en 1 el valor dado a 'i' en la l\u00ednea anterior, asignando posteriormente 
															 *ese valor a '--i', el valor que imprime en este caso es 2
															 */

		System.out.println("i-- : " + i--);                 /* En esta l\u00ednea, al usarse en su forma de sufijo i--, el valor de ‘i’ 
															 *decrece solamente despu\u00e9s de que el valor actual de ‘i’ haya sido utilizado en 
															 *expresi\u00f3n, esto es, primero se asigna i a i-- y despu\u00e9s se reduce el valor de i. 
															 *El valor que imprime es igualmente 2
															 */

		System.out.println(" i : " + i);  					/*Como el valor de 'i' ha decrecido tras su asignación a 'i--', 
										   					 *en este caso el valor de 'i' que se imprime es 1
										   					 */
	

	}
	
}