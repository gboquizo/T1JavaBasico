/**
*Clase Ivas
*El iva es un impuesto aplicable al consumo en la CEE. 
*En España hay tres tipos de ivas: superreducido 4%, reducido 10% y general 21%. 
*Calcula y muestra el iva aplicado a los siguientes productos: Papel higi\u00e9nico (2,70), pa\u00f1ales (15,95), maquinilla de afeitar (8,75), colonia (1,45).
*
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0.
*
*/

public class Ivas{
	public static void main(String[] args) {
		
		double precioPapel = 2.70; //Declaraci\u00f3 e inicializaci\u00f3n de la variable precioPapel,
                                  //el precio del papel.
                                  
		double precioPannal = 15.95; //Declaraci\u00f3 e inicializaci\u00f3n de la variable precioPannal,
                                    //el precio del pa\u00f1.
                                    
		double precioMaquinilla = 8.75; //Declaraci\u00f3 e inicializaci\u00f3n de la variable precioMaquinilla,
                                       //el precio de la maquinilla.
                                       
		double precioColonia = 1.45; //Declaraci\u00f3 e inicializaci\u00f3n de la variable precioColonia, 
                                    //el precio de la colonia.

		double ivaS = 1.04; //Declaraci\u00f3 e inicializaci\u00f3n de la variable ivaS, iva superreducido.
		double ivaR = 1.10; //Declaraci\u00f3 e inicializaci\u00f3n de la variable ivaR, iva reducido.
		double ivaG = 1.21; //Declaraci\u00f3 e inicializaci\u00f3n de la variable ivaG, iva general.

		double ivaSPannal = Math.round ((precioPannal * ivaS) * 1000) / 1000D; //Declaraci\u00f3 e inicializaci\u00f3n de la
                                                                              //variable ivaSPannal, iva superreducido de los pa\u00f1ales.
                                                                              
		double ivaRPapel = Math.round ((precioPapel * ivaR) * 1000) / 1000D;//Declaraci\u00f3 e inicializaci\u00f3n de la
                                                                           //variable ivaRPapel, iva reducido del papel.
                                                                           
		double ivaGMaquinilla = Math.round ((precioMaquinilla * ivaG) * 100000) / 100000D; //Declaraci\u00f3 e
                                                                                        //inicializaci\u00f3n de la variable
                                                                                       //ivaGMaquinilla, iva general de la 
                                                                                      //maquinilla.
                                                                                      
		double ivaGColonia = Math.round ((precioColonia * ivaG) * 100000) / 100000D;//Declaraci\u00f3 e inicializaci\u00f3n
                                                                                   //de la variable ivaGColonia, iva general
                                                                                  //de la colonia.

		System.out.println("\nLos precios de los productos son : \n" 
        + "\n\t" + precioPapel + "\u20AC para el papel." 
        + "\n\t" + precioPannal + "\u20AC para los pa\u00f1ales."
        + "\n\t" + precioMaquinilla + "\u20AC para la maquinilla."
        + "\n\t" + precioColonia + "\u20AC para la colonia.\n");

		System.out.println("\nEl nuevo precio con el I.V.A aplicado a estos productos(4%) con precio " + precioPannal + " es de: \n"
        + "\n\t" + ivaSPannal + "\u20AC para los pa\u00f1ales.");

		System.out.println("\nEl nuevo precio con el I.V.A aplicado a estos productos(10%) con precio " + precioPapel + " es de: \n"
		+ "\n\t" + ivaRPapel + "\u20AC para el papel.");

		 System.out.println("\nEl nuevo precio con el I.V.A aplicado a estos productos(21%) con precio " + precioMaquinilla + " y " + precioColonia + " es de: \n"
		+ "\n\t" + ivaGMaquinilla + "\u20AC para la maquinilla."
        + "\n\t" + ivaGColonia + "\u20AC para la colonia.\n");

	}
}

