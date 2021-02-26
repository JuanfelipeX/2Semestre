
package Vectores;

public class Example1 {

    public static void main(String[] args) {
        int nums [] = new int [7];  //inicia en 0 a 6
        for(int i: nums){
            System.out.println("pos " + i + ". " + nums[i]);
           // System.out.println(i);
        }
      //  System.out.println(nums[7]); se paso del limite  ArrayIndexOutOfBoundsException

        boolean bol [] = new boolean [7];  
        for(boolean q : bol){
            System.out.println(q); 
        }
        
        String string [] = new String[7]; 
        for(String k : string){
            System.out.println(k);
        }
        // System.out.println(string[2].trim()); java.lang.NullPointerException  esta vacio, no hay datos
        
    } 
}
