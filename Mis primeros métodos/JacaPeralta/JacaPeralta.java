/**
*Crea la clase JacaPeralta que 7 veces:
*Solicite el nombre al usuario String  pedirNombreUsuario()
*Lo salude saludar(String nombreUsuario)
*Lo despida despedir(String nombreUsuario)
*@author: Guillermo Boquizo S\u00e1nchez
*@version: 1.0
*/
 public class JacaPeralta {
    public static void main(String[] args) {

        String nombre;
            for (int i = 0; i < 7; i++) {
            nombre = pedirNombreUsuario();
            saludar(nombre);
            despedir(nombre);
        }
    }
   
    /**
    * Solicita el nombre al usuario
    *@return el nombre solicitado
    */
    static String pedirNombreUsuario() { 
        return Teclado.leerCadena("\n\tPor favor, introduzca su nombre:");
    }   
    /**
    * Toma el nombre y saluda
    *
    */
    static void saludar(String nombre) {
        System.out.println("\n\tHola " + nombre);
    }
    /**
    * Toma el nombre y despide
    *
    */
     static void despedir(String nombre) {
        System.out.println("\n\tAdi\u00f3s " + nombre);
    }
}