
package StringClase;

public class RegionMatches {   // se usa para seleccionar una cadena de caracteres para hacer respectiva comparaciones 

    public static void main(String[] args) {
        String a1 = new String("hello");
        String b1 = "Hello";
        if (a1.regionMatches(0, b1, 0, 4)) {  // el 0 es el indice de la cadena 1, "el b1" el objeto a comparar, el "0" es el indice de la cadena 2, el "3" numero de caracteres que seran comprobados
            System.out.println("melo");
        } else{
               System.out.println("inmelo");     
        }
        System.out.println(a1.regionMatches(true, 0, b1, 0, 4)); //"true" es si importa si hay mayus o minus, el "0" es el indice de la cadena, "el b1" el objeto a comparar, el "0" es el indice de la cadena 2, el "3"  numero de caracteres que seran comprobados
    }
}
