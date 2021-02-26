
package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BerSUBall {   // aplicar codigo burbuja es Lento
    static int [][] dp = new int [101][101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nBoy = Integer.parseInt(br.readLine());
        int [] skillsBoy = new int [nBoy];
        String[] texto = br.readLine().split(" ");
        for (int i = 0; i < skillsBoy.length; i++) {
            skillsBoy[i] = Integer.parseInt(texto[i]);
            Arrays.sort(skillsBoy);
        }
        
        int mGirl = Integer.parseInt(br.readLine());
        int [] skillsGirl = new int [mGirl];
        String [] texto2 = br.readLine().split(" ");
        for (int i = 0; i < skillsGirl.length; i++) {
            skillsGirl[i] = Integer.parseInt(texto2[i]);
        }
        Arrays.sort(skillsGirl); //mergeSort
    }
        
         
    
    
    /*public static void main(String[] args) throws IOException {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine(); // descartar la línea con el número de elementos del arreglo

        int[] skillsBoy;

        String[] numeros = br.readLine().split(" "); // crear arreglo con los números

        skillsBoy = Arrays.stream(numeros) // crear stream de cadenas a partir del arreglo numeros
                .mapToInt(Integer::parseInt) // convertir cada cadena en un entero
                .toArray(); // crear un arrreglo de enteros


        br.readLine();
        int[] skillsGirl;
        numeros = br.readLine().split(" ");
        skillsGirl = Arrays.stream(numeros).mapToInt(Integer::parseInt).toArray();

    }
    */
    
     static int dynamic(int  nBoy , int mGirl){
         int a=0, b=0, c=0;
        if (dp[nBoy][mGirl] != -1) {
            return dp[nBoy][mGirl];
        }
        if (nBoy==mGirl) {
             return 0;
        }
        if (mGirl==nBoy) {
             return 0;
        }
        //a=1+dynamic(nBoy+1,mGirl+1);
        //b=dynamic(nBoy+1, mGirl);
        //return dp[nBoy][mGirl] = Math.max() ; //Falta definir los estados 

    }
}




















//https://codeforces.com/contest/489/submission/53830291
//https://codeforces.com/contest/489/submission/39227258
//https://www.codenong.com/cs105922619/