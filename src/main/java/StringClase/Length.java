
package StringClase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Length {  // retorna el numero de caracteres que conctiene un string

    public static void main(String[] args) throws IOException{ 
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Ingrese una frase: ");
         String frase = br.readLine();
         int cantidad = frase.length(); 
         System.out.println("la cantidad de caracteres en la frase es: " + cantidad);
    }   
}
