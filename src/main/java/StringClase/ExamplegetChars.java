
package StringClase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamplegetChars {

    public static void main(String[] args) throws IOException {
         String palabra = "hello world";
         String cs = "good morning";
         char [] arregloChar = new char[30];
         palabra.getChars(0, 5, arregloChar, 6);
         cs.getChars(0, cs.length(), arregloChar, 6);
         System.out.println(arregloChar);
    } 
}
