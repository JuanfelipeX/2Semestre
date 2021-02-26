
package StringClase;

public class EqualsDiferencias {  //Diferencias entre Equals & ==

    public static void main(String[] args) {
        String cadena1 = new String("Arbol");
        String cadena2 = "Arbol";
        if (cadena1 == cadena2) {  //No se pueden comparan dos objetos porque apunta a otro de punto de memoria
            System.out.println("coinciden");
        } else {
            System.out.println("No coinciden");
        }
        //Compara dos Strings con == se compara si los dos objetos son iguales
        //Compara dos Strings con equals/equalsIgnoreCase se compara el contenido
    }  
}
