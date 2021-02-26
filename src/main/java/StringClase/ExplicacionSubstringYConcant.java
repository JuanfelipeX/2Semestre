
package StringClase;
/*Exposicion concatenacion de cadenas*/
public class ExplicacionSubstringYConcant {

    public static void main(String[] args) {
    //Establecer las variables palabras u/o frases que se quieren concatenar
    String Variable1 ="Exposicion de Concatenación:";
    String Variable2 ="Se usa el metodo de concat para unir o concatenar las palabras u/o frases";
    //se haria como lo conocemos de esta manera
        System.out.println(Variable1+Variable2);
        System.out.println("/");
    //pero al usar concat para hacer la accion de concatenar las variables
    String Variable3=Variable1.concat(Variable2);
        System.out.println("La concatenacion queda"+Variable3);
    }
}
