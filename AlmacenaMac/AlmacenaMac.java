/**
*<p>Las  direcciones  MAC  son  n\u00fameros  de  6  bytes  que  identifican  a  las  tarjetas  de  red.</p>
*<p>Cuando contienen el valor m\u00e1ximo (FFFFFFFFFFFF) se considera que el mensaje quiere enviarse no a una tarjeta de red, sino a todas las de la red.</p>
*<p>A esa direcci\u00f3n especial se le denomina direcci\u00f3n broadcast.</p> 
*<p>Crea la clase AlmacenaMac que almacene y muestre la direcci\u00f3n de broadcast.</p>
*@author Guillermo Boquizo S\u00e1nchez
*@version 1.0
*/

public class AlmacenaMac{
	public static void main(String[] args){

	long broadcast; //Declaramos la variable valorMaximo, que recoge el valor m\u00e1ximo de un literal hexadecimal.  
	broadcast = 0xFF_FF_FF_FF_FF_FFL;//Asignamos a nuestra variable el valor m\u00e1ximo denominado direcci\u00f3n broadcast\r
								 	//Al ser un n\u00famero hexadecimal grande usaremos el primitivo long, 0x antes del valor y L al final del valor.
	System.out.println("\nLa direcci\u00f3n broadcast es " + broadcast + "\n");//Pedimos que nos muestre en pantalla el valor de valorMaximo. 
	
	int intMax = Integer.MAX_VALUE; 
	System.out.println(intMax++);
	System.out.println(intMax);//Cuidado, en este caso, al sumar al valor m\u00e1ximo, se pasa de rango.
	}
}