
package StringClase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class getChars {  // recupera una pequeña muestra de caracteres almacenados en una variable y almacena en un vector

    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese texto: ");
        char[] caracteres = new char[5];
        String texto = br.readLine();
        System.out.println("La longitud es: " + texto.length());
        System.out.println(texto.charAt(3));   //devuelve el caracter en la posicion dada
        texto.getChars(0, texto.length(), caracteres, 0);  // el primer "0" da la poscion inical, el segundo la cantidad de caracteres finals, el tercero lo guarda en la variable "caracteres", la cuarta empieza a guardarlo desde la posicion dada
        System.out.println("el arreglo de caracteres es: ");
        for(char posiciones : caracteres){
            System.out.println(posiciones);
        }
    }
}
