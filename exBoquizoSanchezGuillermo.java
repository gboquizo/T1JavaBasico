package Examen;
import utiles.Teclado;
/**
* Examen noviembre 2016
*
*Previamente a las instrucciones, recuerda:
*1. El codigo no solo ha de compilar y funcionar segun estas disposiciones,
*sino que ha de ser legible y eficiente, sin redundancia y con una finalidad clara.
*2. En tu sistema de archivos crea la carpeta 'exNombreApellido1Apellido2'.
*Contendra los ficheros 'Teclado.java' y 'exNombreApellido1Apellido2.java'.
*3. Genera la documentacion javadoc y entregala junto con el resto de los documentos. Para ello:
*a. La clase ha de tener su comentario junto con el nombre del autor correctamente identificado segun javadoc
*b. Documenta tambien los metodos
*4. Entrega la carpeta completa (codigo fuente y documentacion generada) comprimida en un fichero exNombreApellido1Apellido2
*5. La conexion a la red queda TERMINANTEMENTE PROHIBIDA.
*Solo podra utilizarse para la descarga y para la entrega del examen.
*6. El uso de cualquier otro material queda TERMINANTEMENTE PROHIBIDO.
*7. El codigo sera generado por el alumno en el momento del examen, por lo que ha de ser eficiente.
*8. Podra utilizarse el editor de textos sublime, notepad++ o similar
*
*
*@author Guillermo Boquizo Sanchez
*@version 1.0
*
*/
public class exBoquizoSanchezGuillermo {
	public static void main (String[] args){
		int opcion;
		System.out.println("Bienvenido al examen de programación.");
		do {

			mostrarMenu();
			opcion = recogerOpcionMenu();
			realizarOpcionMenu(opcion);

		} while (opcion != 0);
	}

    /**
    * Muestra las opciones del menú
    *
    *
    */
    private static void mostrarMenu() {
    	System.out.println("0. Salir");
    	System.out.println("1. El triple de un número");
    	System.out.println("2. Dibuja un cuadrado. Se pedirá la dimension entre 3 y 9");
    	System.out.println("3. ¿Es consonante o vocal?");
    	System.out.println("4. Mostrar hasta que sea mayor que 0.95");
    	System.out.println("5. 80 primeros números múltiplos de 7 impares");
    }

    /**
    * Recoge las opciones del menú en una variable opción
    *
    * @return opcion Una opción válida introducida por teclado
    *
    */
    private static int recogerOpcionMenu() {
    	int opcion;
    	do {

    		opcion =Teclado.leerEntero("\nElige una opción entre 1 y 5, o pulsa 0 para salir\n");

    	} while (opcion < 0 || opcion > 5);
    	return opcion;
    }

    /**
    * Realiza una acción del menú introducida por teclado
    *
    *@param opcion opción en entero entre 0 y 5
    *
    */
    private static void realizarOpcionMenu(int opcion) {
    	switch (opcion) {
    		case 0: 
    			System.out.println("Hasta pronto");
    		break;
    		case 1: 
    			calcularTriple();
    		break;
    		case 2:
    			dibujarCuadrado();
    		break;
    		case 3: 
    			consonanteOVocal();
    		break;
    		case 4: 
    			casiUno();
    		break;
    		case 5: 
    			multiplosImpares();
    		break;
    		default:
    			System.out.println("\nLa tecla introducida no es correcta. Introduce un entero entre 1 y 5");
    		break;
    	}
    }
    private static void dibujarCuadrado () {
    	dibujarCuadrado(pedirDimension());
    }
	/**
    * Dibuja un cuadrado utilizando una dimensión pedida por teclado
    *
    * @param dimension dimensión válida pedida por teclado
    */
	private static void dibujarCuadrado(int dimension) {

		String filaSup = "";
		String filaInter = "";

		for (int i = 0; i < dimension; i++) {
			filaSup += "*";
		}

		for (int j = 0; j < dimension - 2; j++) {
			filaInter += "*";
			for (int k = 0; k < dimension - 2; k++) {
				filaInter += " ";
			}
			filaInter += "*\n";
		}

		System.out.println(filaSup);
		System.out.print(filaInter);
		System.out.println(filaSup);
	}

	/**
    * Pide la dimension del cuadrado
    *
    * @return dimension dimensión en el rango determinado entre 3 y 9
    */
    private static int pedirDimension() {
    	int dimension = 0;
    	do {
    		dimension = Teclado.leerEntero("\nIntroduce la dimension entre 3 y 9:\n");
    	} while (dimension < 3 || dimension > 9);
    	return dimension;
    }

    /**
    * Pide un número entero por teclado, y muestra su triple
    *
    *
    */
    private static void calcularTriple(){
    	int numero;
    	numero = Teclado.leerEntero("\nDame un número y te daré su triple\n");
    	System.out.println("\nEl triple de "+ numero + " es " + calcularTriple(numero)+ "\n");
    }


    /**
    * Calcula el triple de un número long pasado como parámetro
    *
    *@param numero número pasado como parámetro
    *@return numero triple del número pasado
    *
    */

    private static long calcularTriple(long numero){
    	return numero * 3L;

    }


    /**
	* Muestra por consola si el carácter introducido por teclado
    * es vocal, consonante o no es una letra del abecedario.
	*/
	private static void consonanteOVocal() {
		char caracter;
		Strign cadena;
		do {
			caracter = Teclado.leerCaracter("Introduce un carácter y te compruebo si es consonante o vocal. \nPara salir introduce \"*\".");
			caracter = Character.toUpperCase(caracter);
			if (esLetraMayuscula(caracter)) {
				cadena += "Es una mayuscula "
				if (esVocalMayuscula(caracter))
					cadena += " vocal");
				else
					System.out.println("El carácter introducido es una consonante");
			} else {
				System.out.println("El carácter introducido no es una letra del abecedario");
			}
		} while (caracter != '*');
	}

	/**
	 * Devuelve si el carácter es una letra mayúscula
	 * 
	 * @param caracter letra o signo introducido por teclado
	 * @return caracter letra mayúscula entre A y Z
	 */
	private static boolean esLetraMayuscula(char caracter) {
		return caracter >= 'A' && caracter <= 'Z';
	}

	/**
	 * Devuelve si el caracter es una vocal mayúscula
	 * 
	 * @param caracter  letra o signo introducido por teclado
	 * @return caracter  letra mayúscula entre A y Z
	 */
	private static boolean esVocalMayuscula(char caracter) {
		return caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U';
	}


    /**
    * Muestra números aleatorios menores que 0.95 y el total de numeros
    * impresos
    */
    private static void casiUno() {
    	double numero = 0;
    	int contador = 0;
    	while (numero < 0.95) {
    		System.out.println(numero = Math.round(Math.random() * 100) / 100d);
    		contador++;
    	}
    	System.out.println("\nTotal números contabilizados:" + contador + "\n");
    }


    /**
    *
    * Calcula los 80 primeros múltiplos de 7 que sean impares.
    */
    private static void multiplosImpares() {
    	int contador = 0;
    	for (int i = 0; contador < 80; i++) {
    		if (i % 7 == 0 && i % 2 != 0) {
    			System.out.print(i + " ");
    			contador++;
    		}
    	}
    	System.out.println("\n");
    }
}