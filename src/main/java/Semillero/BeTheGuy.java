package Semillero;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;


public class BeTheGuy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int entrada = Integer.parseInt(br.readLine());
        TreeSet<Integer> conjunto = new TreeSet<>();
          String[] pStr = br.readLine().split(" ");
          //int p = Integer.parseInt(pStr[0]);
          int p =0;
          while(p < pStr.length ){
              int num = Integer.parseInt(pStr[p]);
              if (num > 0) {
                  conjunto.add(num);
              }
              p++;
          }
           String[] pR = br.readLine().split(" ");
          //int q = Integer.parseInt(pStr[0]);
          int q=0;
          while( q < pR.length ){
              int num2 = Integer.parseInt(pR[q]);
              if (num2 > 0) {
                  conjunto.add(num2);
              }
              q++;
          }
        if (conjunto.size()== entrada) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}