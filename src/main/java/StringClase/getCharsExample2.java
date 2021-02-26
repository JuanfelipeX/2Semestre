
package StringClase;

public class getCharsExample2 {

    public static void main(String[] args) {
     String cadena1 = "hello";
     char [] cadena2 = new char[8];
     cadena1.getChars(1, 4, cadena2, 3);
     System.out.println("INICIO");
        for (int i = 0; i < cadena2.length; i++) {
            System.out.println(i + ". " + cadena2[i]);
        }
        System.out.println("FIN");
    } 
}
