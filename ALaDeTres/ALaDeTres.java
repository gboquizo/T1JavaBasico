/**
*<h1>A la de 3... a la de 2... a la de 1</h1>
*
*<p>Utilizando el for, entrega un programa ALaDeUna que muestre:</p>
*<ul>
*	<li>A la de 1... </li>
*
*	<li>A la de 2... </li>
*
*	<li>A la de 3....</li>
*</ul>
*
*<p>Semejante al anterior, entrega la clase ALaDeTres que muestre:</p>
*<ul>
*	<li>A la de 3...</li>
*
*	<li>A la de 2...</li>
*
*	<li>A la de 1....</li>
*</ul>
*@author Guillermo Boquizo S\u00e1nchez
*@version 1.0
*/
public class ALaDeTres{
	public static void main (String[] args){

		System.out.println ("\n\tCon for:");			
		
		for (int i = 3; i > 0; i--){
		
			System.out.println("\n\tA la de " + i + "...");
		}
	}
}