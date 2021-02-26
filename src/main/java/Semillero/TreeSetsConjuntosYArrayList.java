
package Semillero;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetsConjuntosYArrayList {
    
    public static void main(String[] args) {
        TreeSet<String> A = new TreeSet();
        A.add("Jueves");
        A.add("Martes");
        A.add("Diana");
        A.add("Gabriel");
        A.add("Gabriel");
        A.add("Gabriel");
        A.add("Gabriel");
        A.add("Gabriel");
        
        System.out.println(A);  //Desde la linea 9 a 19 Muestra un conjunto ordenados alfabeticamente
       
        for(String s: A){              // En este for muestra el conunto de forma de lista
            System.out.println(s);  
        }              
        System.out.println(A.contains("Arles"));  //Retona un booleano y indica si el treeSet tiene elementos o no  (falso por que arles no esta en el treeSet
        System.out.println(A.pollLast()); // Retorna Y elimina el elemento mas grande del treeSet (elimina martes)

           
        ArrayList<String> nombres = new ArrayList<>();  // ArrayList lista de objetos o datos categoriza en el orden dado
        nombres.add("programación");
        nombres.add("Ricardo");
        nombres.add("Andrés");
        System.out.println("lista=" + nombres); //Devuelve los nombres dados (programacion, ricardo,andres)
    
        A.addAll(nombres); 
        System.out.println(A);  //Aqui se unen los TreeSetsConjuntosYArrayList y Arraylist en una sola
        
        TreeSet<String> B = new TreeSet<>();
        B.add("Ricardo");
        B.add("Jueves");
        B.add("Juan Felipe");
        A.retainAll(B);   //interseccion
        System.out.println("A n B = " + A);  // Aqui esta la intereseccion entre a y b
        A.addAll(B);  // union 
        System.out.println("A u B = " + A);  // Aqui esta la union entre a y b
  
    }
}
