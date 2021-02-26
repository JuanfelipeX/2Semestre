
package StringClase;

public class IndexOfYLatestOf {  // encontrar el caracter inicial de una cadena de caracteres, hay 5 variaciones 
    
    // LatestIndex es un metodo para encontrar el indice del ultimo caracter

    public static void main(String[] args) {
        String numbers = "1234567890";
        System.out.println(" el '2' se encuentra en " + numbers.indexOf('2'));
        System.out.println(" el '4' se encuentra en " + numbers.indexOf('4' , 5));  // el segundo parametro sirve para emepezar a buscar en el string
        System.out.println(" el ultimo '6' se encuentra en el indice " + numbers.lastIndexOf('6'));
        System.out.println(" el 'h' se encuentra en el indice" + numbers.lastIndexOf('h'));
        
    }
}
