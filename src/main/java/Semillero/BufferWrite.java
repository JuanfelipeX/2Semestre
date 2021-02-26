
package Semillero;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite {

    
    public static void main(String[] args) {
  String sFichero = "fichero.txt";
  File fichero = new File(sFichero);
  if (fichero.exists())
      System.out.println("El fichero " + sFichero + " ya existe");
  else {
      try{
          BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));   //BufferWritePeroGuardaelFichero en texto (.txt) MetodorPro
		
     // Escribimos 10 filas
     for (int x=0;x<10;x++)
       bw.write("Fila numero " + x + "\n");

     // Hay que cerrar el fichero
     bw.close();
      } catch (IOException ioe){
     ioe.printStackTrace();
      }
  }
    }
}
