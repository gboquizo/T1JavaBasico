/**
*<p>Entrega la clase "ValoresLimite" donde se almacenen y muestren los valores m\u00e1ximos y m\u00ednimos de cada tipo de variable.</p>
*<p>Utilizad los envoltorios de los datos primitivos (Byte.MIN_VALUE, Short.MAX_VALUE, Integer, Long...)</p>
*<p>Despu\u00e9s de mostrarlos aumenta los m\u00e1ximos y decrementa los m\u00ednimos.</p> 
*<p>Utiliza los operadores de asignaci\u00f3n autoincremento/autodecremento.</p>
*<p>Vuelve a mostrarlos. ¿Qu\u00e9 ocurre?</p>
*@author Guillermo Boquizo S\u00e1nchez
*@version 1.0
*/

public class ValoresLimite{
public static void main (String[]args){
	
	/*
	* Declaramos y asignamos usando los respectivos envoltorios.
	*
	*/
	byte byteMax = Byte.MAX_VALUE;
	byte byteMin= Byte.MIN_VALUE;
	short shortMax = Short.MAX_VALUE;
	short shortMin = Short.MIN_VALUE;
	int intMax = Integer.MAX_VALUE;
	int intMin = Integer.MIN_VALUE;
	long lMax = Long.MAX_VALUE;
	long lMin = Long.MIN_VALUE;
	float fMax = Float.MAX_VALUE;
	float fMin = Float.MIN_VALUE;
	double dMax = Double.MAX_VALUE;
	double dMin = Double.MIN_VALUE;


	/*
	*	Muostramos
	*
	*/
    System.out.println("\n\tTipo\tM\u00ednimo\t\t\t\tM\u00e1ximo");
    System.out.println("\n\tbyte:\t" + byteMin + "\t\t\t\t" + byteMax);
    System.out.println("\n\tshort:\t" + shortMin + "\t\t\t\t" + shortMax);
    System.out.println("\n\tint:\t" + intMin + "\t\t\t" + intMax);
    System.out.println("\n\tlong:\t" + lMin + "\t\t" + lMax);
    System.out.println("\n\tfloat:\t" + fMin + "\t\t\t\t" + fMax);
    System.out.println("\n\tdouble:\t" + dMin + "\t\t\t" + dMax);
    System.out.println();
    System.out.println();

 	/* 
	Opci\u00f3n alternativa, con prefijos para autodecremento y autodecremento:
 	System.out.println("\n\tTipo\tM\u00ednimo con autodecremento\tM\u00e1ximo con autodecremento");
    System.out.println("\n\tbyte:\t" + --byteMin + "\t\t\t\t" + ++byteMax);
    System.out.println("\n\tshort:\t" + --shortMin + "\t\t\t\t" + ++shortMax);
    System.out.println("\n\tint:\t" + --intMin + "\t\t\t" + ++intMax);
    System.out.println("\n\tlong:\t" + --lMin + "\t\t" + ++lMax);
    System.out.println("\n\tfloat:\t" + --fMin + "\t\t\t\t" + ++fMax);
    System.out.println("\n\tdouble:\t" + --dMin + "\t\t\t\t" + ++dMax);
	*/


    /*
    * Se aplica el autodecremento y autoincremento a cada tipo.
    *
    */
    byteMin--;
    byteMax++;
    shortMin--;
    shortMax++;
    intMin--;
    intMax++;
    lMin--;
    lMax++;
    fMin--;
    fMax++;
    dMin--;
    dMax++;

    /*
    * Al volver a mostrarlos, se pasa de rango y los valores de m\u00ednimos y m\u00e1ximos se alternan.
    *
    */
    System.out.println("\n\tTipo\tM\u00ednimo\t\t\t\tM\u00e1ximo");
    System.out.println("\n\tbyte:\t" + byteMin + "\t\t\t\t" + byteMax);
    System.out.println("\n\tshort:\t" + shortMin + "\t\t\t\t" + shortMax);
    System.out.println("\n\tint:\t" + intMin + "\t\t\t" + intMax);
    System.out.println("\n\tlong:\t" + lMin + "\t\t" + lMax);
    System.out.println("\n\tfloat:\t" + fMin + "\t\t\t\t" + fMax);
    System.out.println("\n\tdouble:\t" + dMin + "\t\t\t\t" + dMax);
    System.out.println();
    System.out.println();

	}
}