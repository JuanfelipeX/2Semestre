
package Vectores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {

    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      /*  String  letters1 = "programa";
        String  letters2 = "programa2";
        String  letters3 = "programa3";
        */
        String word [] = new String[7];
       /*word[0] = letters1;
       word[1] = letters2;
       word[2] = letters3;
       word[3] = "esfero";
        System.out.println("Tamaño:" + word.length);
        for(String i: word){
            System.out.println(i);
        }
        */
       
       
       /* for(String j:word){
            System.out.println("Ingrese palabras:");
            word[j] = br.readLine();
        }
        
        for(String q:word){
            System.out.println(q);
        }
       */
       
       
        for (int i = 0; i < word.length; i++) {
            System.out.println("Ingrese palabra: " + i);
            word[i] = br.readLine();
        }
        
        for (int i = 0; i < word.length; i++) {
            System.out.println(i + ". " + word[i]);
        }   
       // System.out.println(word);  error el arreglo no se puede imprimir los arreglos directamente
       
       
    }
}
 