
package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Maximu_Sum {  //https://vjudge.net/contest/411078#problem/H

    public static void main(String[] args) throws IOException {
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            char cases = (char)br.read();
            int numero = cases-1;
             while((cases % numero)!=0){
            numero--;
             }
             if (numero==1) {
                 System.out.println("Primo ");
            } else {
                 System.out.println("No-Primo");
             }
        }
    */
       
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            String[] text = br.readLine().split(""); 
           // Arrays.sort(line);
            //String c = "Case " + (i + 1) + ":" +" "; 
            int numero = size-1;
             while((size % numero)!=0){
            numero--;
             }
             if (numero==1) {
                 System.out.println("Primo ");
            } else {
                 System.out.println("No-Primo");
             }
             System.out.println("Case " + (i + 1) + ":" +" ");
        }
            
            /*int x = 1;
            for (int j = 0; j < line.length - 1; j++) {
                 if (line[j].equals(line[j + 1])) { 
                     x++;
                     if (primo(x)) { 
                         c += line[j];
                     } 
                     x = 1; 
                 }
            }
            if (primo(x)) { 
                c += line[line.length - 1]; 
            }
            if (c.equals("Case " + (i + 1) + ":" +" ")){
                System.out.println(c+"empty"); 
            } else { 
                System.out.println(c);
            }*/
        
            
           
       /*  int array [] = new int[size];
         for (int i = 0; i < array.length; i++) {
             array[i]= Integer.parseInt(br.readLine());
              Arrays.sort(array);
         }
          int zero = Integer.parseInt(br.readLine());
          System.out.println(array);
        //*/
    }
    
    public static boolean primo(int x) {
        if(x <2){
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        } return true;
    }
}

