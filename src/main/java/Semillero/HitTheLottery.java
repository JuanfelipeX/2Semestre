
package Semillero;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HitTheLottery {
    
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int h=0;
        if (n>=100) {
            int c1 = n/100;
            h+= c1; 
            n-=(c1*100);
         }
         if (n>=20) {
            int c2 = n/20;
            h+=c2;
            n-=(c2*20);
         }
         if (n>=10) {
           int c3 = n/10;
            h+=c3;
            n-=(c3*10);  
         }
         if (n>=5) {
             int c4 = n/5;
            h+=c4;
            n-=(c4*5);
         }
         if (n>=1) {
             int c5 = n/1;
            h+=c5;
            n-=(c5*1);
         }
         System.out.println(h);
    }
}

//https://codeforces.com/contest/996/problem/A
