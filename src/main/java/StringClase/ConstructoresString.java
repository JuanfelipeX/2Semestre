
package StringClase;

public class ConstructoresString {

    public static void main(String[] args) {
        char [] arregloChar = { 'c' , 'a' , 'n' , 't' , 'i' , 'n' , 'a' };
        String a1 = new String("compras"); //variable tipo String
        String b1 = new String(); // muestra mensaje vacio, no hay metodos dentro del cuerpo
        String b2 = new String(a1);  // muestra el mensaje de la variable "a1"
        String b3 = new String(arregloChar);  // muestra cada una de sus letras
        String b4 = new String(arregloChar , 1 , 3);  // llama a "arregloChar" , el "1" es la posicion inicial, el "3" es la cantidad de caracteres
        System.out.println(a1 + "\n" + b1 + "\n" + b2 + "\n" + b3 + "\n" + b4);
    } 
}
