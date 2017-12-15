/**
*Clase IvasTotal
*El iva es un impuesto aplicable al consumo en la CEE. 
*En España hay tres tipos de ivas: superreducido 4%, reducido 10% y general 21%. 
*Calcula y muestra el iva aplicado a los siguientes productos: Papel higi\u00e9nico (2,70), pañales (15,95), maquinilla de afeitar (8,75), colonia (1,45).
*
*@author Guillermo Boquizo S\u00e1nchez
*@version 1.0
*
*/

public class IvasTotal{
	public static void main(String[] args) {
		
		double precioPapel = 2.70;
		double precioPannal = 15.95;
		double precioMaquinilla = 8.75;
		double precioColonia = 1.45;

		double ivaS = 0.04;
		double ivaR = 0.10;
		double ivaG = 0.21;

		double resultadoSPapel = Math.round ((precioPapel * ivaS) * 1000) / 1000D;
		double resultadoSPannal = Math.round ((precioPannal * ivaS) * 1000) / 1000D;
		double resultadoSMaquinilla = Math.round ((precioMaquinilla * ivaS) * 1000) / 1000D;
		double resultadoSColonia = Math.round ((precioColonia * ivaS) * 1000) / 1000D;

		double resultadoRPapel = Math.round ((precioPapel * ivaR) * 1000) / 1000D;
		double resultadoRPannal = Math.round ((precioPannal * ivaR) * 1000) / 1000D;
		double resultadoRMaquinilla = Math.round ((precioMaquinilla * ivaR) * 1000) / 1000D;
		double resultadoRColonia = Math.round ((precioColonia * ivaR) * 1000) / 1000D;

		double resultadoGPapel = Math.round ((precioPapel * ivaG) * 100000) / 100000D;
		double resultadoGPannal = Math.round ((precioPannal * ivaG) * 100000) / 100000D;
		double resultadoGMaquinilla = Math.round ((precioMaquinilla * ivaG) * 100000) / 100000D;
		double resultadoGColonia = Math.round ((precioColonia * ivaG) * 100000) / 100000D;

		System.out.println("\nLos precios de los productos son : \n" 
		 	+ "\n\t" + precioPapel + " euros para el papel." +
		 	"\n\t" + precioPannal + " euros para los pa\u00f1ales." +
		 	"\n\t" + precioMaquinilla + " euros para la maquinilla." +
		 	"\n\t" + precioColonia + " euros para la colonia.\n");

		System.out.println("\nEl I.V.A superreducido de estos productos (4%) es de: \n" 
		 	+ "\n\t" + resultadoSPapel + " euros para el papel." +
		 	"\n\t" + resultadoSPannal + " euros para los pa\u00f1ales." +
		 	"\n\t" + resultadoSMaquinilla + " euros para la maquinilla." +
		 	"\n\t" + resultadoSColonia + " euros para la colonia.\n");

		System.out.println("\nEl I.V.A reducido de estos productos (10%) es de: \n" 
		 	+ "\n\t" + resultadoRPapel + " euros para el papel." +
		 	"\n\t" + resultadoRPannal + " euros para los pa\u00f1ales." +
		 	"\n\t" + resultadoRMaquinilla + " euros para la maquinilla." +
		 	"\n\t" + resultadoRColonia + " euros para la colonia.\n");

		 System.out.println("\nEl I.V.A general de estos productos (21%) es de: \n" 
		 	+ "\n\t" + resultadoGPapel + " euros para el papel." +
		 	"\n\t" + resultadoGPannal + " euros para los pa\u00f1ales." +
		 	"\n\t" + resultadoGMaquinilla + " euros para la maquinilla." +
		 	"\n\t" + resultadoGColonia + " euros para la colonia.\n");

	}
}

