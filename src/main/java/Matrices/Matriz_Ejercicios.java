
package Matrices;

public class Matriz_Ejercicios {

    public static void main(String[] args) {
        int [][] numbers = new int [5][5];
        System.out.println("Filas: " + numbers.length);  
        System.out.println("Columnas: " + numbers[0].length);  
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "-i" + i + ",j" + j + " ");
            }
            System.out.println(" ");
        }
        
        
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println("");
        }
        System.out.println("Exercise 2");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i>=j) {
                    System.out.print(numbers[i][j]);
                }
            }
            System.out.println(" ");
        }
        
        
        
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println("");
        }
        System.out.println("Exercise 3");
         for (int i = 0; i < numbers.length; i++) {
             for (int j = 0; j < numbers[i].length; j++) {
                 if ((j!=0 && j!=4) && (i>=1 && i<=3)) {
                     System.out.print("  ");
                 } else {
                     System.out.print(numbers[i][j] + " ");
                 }
             }
             System.out.println("");
         }
         
         
         
         
         
         
         
         
         
         for (int i = 0; i < 5; i++) {
            System.out.println("");
        }
         System.out.println("Exercise 4");
         
         String [][] letras = new String [2][3];
         letras[0][0] = "a";
         letras[0][1] = "b";
         letras[0][2] = "c";
         
         
         letras[1][0] = "d";
         letras[1][1] = "e";
         letras[1][2] = "f";
       
         for(String i[]: letras){
             for(String q: i){
                 System.out.print(q + " ");
             }
             System.out.println();
         }
    }
}
