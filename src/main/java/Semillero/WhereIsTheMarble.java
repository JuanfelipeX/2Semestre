
package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WhereIsTheMarble {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static boolean ok(int[] s, int pos, int num){
        return s[pos] < num;
    }

    public static int search(int[] s, int num) {
        int st = 0;
        int end = s.length - 1;

        while (st < end) { // maybe while (end - st > 1)
            //System.out.println(st + "," + end);
            int mid = (st + end) / 2; //usa piso por defecto
            if (!ok(s, mid, num)) {
                end = mid;
            } else {
                st = mid + 1; //maybe mid
            }
        }
        if (s[st] == num) {
            return st; //lower bound
        }else{
            return -1;
        }
    }


   
    
    public static void main(String[] args) throws IOException {
        int cases = 1;
        String texto = br.readLine();
        String [] dato = texto.split(" ");
        while(!texto.equals("0 0")){
        int N = Integer.parseInt(dato[0]);//size array
        int Q = Integer.parseInt(dato[1]);//number queries
        int[] s = new int[N];
        for (int i = 0; i < N; i++) 
            s[i] = Integer.parseInt(br.readLine().trim()); //load array
            Arrays.sort(s);                                  // oredena datos
            System.out.println("CASE# " + cases++ + ":");                               
        for (int i = 0; i < Q; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            int pos = search(s, num);
            if (pos >= 0) 
                System.out.println(num + " found at " + (pos + 1));
             else 
                System.out.println(num + " not found");
            }
        texto = br.readLine();
        dato = texto.split(" ");
       } 
    }   
}


