
package StringClase;

public class MetodosVariosString {  
                                     //  valueOf esta sobre cargado convierte un dato primitivo  
    public static void main(String[] args) {
    String texto = "Automovil";
    String cadena = "Vehiculo";
    String cadena2 = "    hello world    ";
        System.out.println(cadena2.trim());   //trim borra los espacios de un string al inicio o final
        //char  arregloChar [] = { "a" , "m" , "o" , "r"};
        System.out.println("toUpperCase: convierte todo en mayus " + texto.toUpperCase());
        System.out.println("toLowerCase: convierte todo en minus " + texto.toLowerCase());
        System.out.println("replace cambiar automovil 'm' por 'z' " + texto.replace("m", "z")); 
        System.out.println(cadena.toCharArray()); //  ToCharArray() convierte cadena en una arreglo
    } 
}
