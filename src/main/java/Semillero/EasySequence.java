package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EasySequence {      // https://vjudge.net/problem/Gym-310855G

    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] length = new int [3];
        String[] texto = br.readLine().split(" ");
        for (int i = 0; i < length.length; i++) {
            length[i] = Integer.parseInt(texto[i]);
            
        }
        
        int size = Integer.parseInt(br.readLine());
        int [] queries = new int [size];
        for (int i = 0; i < queries.length; i++) {
            int num = Integer.parseInt(br.readLine());
             if (num%2==0){
                 System.out.println("YES");
             }else{
                 System.out.println("NO");
             }
        }
    }
}
}