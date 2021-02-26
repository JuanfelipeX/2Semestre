package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeoremadeDirichlet {  // https://www.titancod.net/problema/DIRICHLET
    
    static int x;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String text = br.readLine();
          String[] datos = text.split(" ");
          int a = Integer.parseInt(datos[0]);
          int b = Integer.parseInt(datos[1]);
          int n = Integer.parseInt(datos[2]);
          for (int i = 1; i <= n; i++) {
              //a = a+b;
              x = a+0;
              a = x+b;
          }
          System.out.println(x);
    }
}
