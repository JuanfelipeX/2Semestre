
package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palidromo {   //Revisar este codigo   https://vjudge.net/contest/406976#problem/H

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int cases = Integer.parseInt(br.readLine());
        for (int i = 0; i < cases; i++) {
            sb.append("Case ").append(i + 1).append(": ");
            sb.append(palindromo(br.readLine()));
            sb.append("\n");
        }
        System.out.print(sb);
    }
    
    static int palindromo(String str) {
        int contador = 0;
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder();
            int[] arr = new int[26];
            int odd = 0;
            for (int j = i; j < str.length(); j++) {
                char c = str.charAt(j);
                sb.append(c);
                arr[c - 'a']++;
                if (arr[c - 'a'] % 2 == 1) {
                    odd++;
                } else {
                    odd--;
                }
                int diff = j - i + 1;
                if ((diff % 2 == 0 && odd == 0) || (diff % 2 == 1 && odd == 1)) {
                    contador++;
                }

            }
        }
        return contador;
    }
}
