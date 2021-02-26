
package Semillero;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CutRibbon {    //se puede hacer con dos estados toca arreglarlo
    
    static int a,b,c;
    static int [] dp = new int [4001];
    static int oo = 1<<9;
    static int dynamic(int n ){
        if (dp[n] != -1) {
            return dp[n];
        }
        if (n==0) {
            return 0;
        }
        if (n<0) {
            return -oo;
        }
        
        return dp[n]  =  Math.max(dynamic(n-a),Math.max((n-b),dynamic(n-c))) +1;                //esto esta mal
       //return dp[n]  =  Math.max(dynamic(n-a)+1,Math.max(dynamic(n-b)+1,dynamic(n-c)+1));
    }
    public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String texto = br.readLine();
            String [] dato = texto.split(" ");
            int n = Integer.parseInt(dato[0]);
             a = Integer.parseInt(dato[1]);
             b = Integer.parseInt(dato[2]);
             c = Integer.parseInt(dato[3]);
             //Arrays.fill(dp,-1);  
             for (int i = 0; i < dp.length; i++) {
                 dp[n]=-1;
        }
            System.out.println(dynamic(n));
    }
}
}













//https://stackoverflow.com/questions/59520258/solving-a-dp-problem-from-codeforces-cut-ribbon
//https://github.com/javed2214/Dynamic-Programming/blob/master/Cut-Ribbon-Problem.cpp
//https://www.quora.com/Can-you-explain-to-me-please-the-dynamic-programming-solution-to-the-Cut-Ribbon-problem-in-Codeforces
//https://www.youtube.com/watch?v=4VBt8sKocyw
