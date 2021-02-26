package Semillero;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferReadandWrite {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //Scanner mejorado mas rapido
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //lectura rapida
        bw.write("hello world");   //BufferWrite
        System.out.println(" Ingrese un numero entero"); 
        int a = Integer.parseInt(br.readLine());   //bufferRead
        System.out.println(" Ingrese un numero double");
        double d = Double.parseDouble(br.readLine());
        System.out.println(" Ingrese una cadena de texto");
        String s = br.readLine();
        System.out.println("Ingrese un numero long");
        long qq = Long.parseLong(br.readLine());
        char c = (char)br.read();
        bw.close();   //BufferWrite
    }
}
