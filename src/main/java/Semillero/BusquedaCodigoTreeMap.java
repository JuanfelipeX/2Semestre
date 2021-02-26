
package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class BusquedaCodigoTreeMap {
    
    public static void main(String[] args) throws IOException {  // Buscar un codigo dando datos  ejemplo final de codigo

        TreeMap<Integer, String> clase = new TreeMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  // indica la cantidad de estudiantes
        
        for(int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");  // Se ingresa el cod(int) y nombre(String) separado por espacion ejemplo final de codigo
            System.out.println("cod: " + line[0]);  
            System.out.println("nom: " + line[1]);
            clase.put(Integer.parseInt(line[0]), line[1]);            
        }
        
        System.out.println("codigo a buscar: ");
        int cod = Integer.parseInt(br.readLine());
        
        if(clase.containsKey(cod)){
            System.out.println("encontrado");
        }else{
            System.out.println("no encontrado");
        }
        
        
        for (int k: clase.keySet()) {
            System.out.println(k + ": " + clase.get(k));
        }
        
    }
}

/*
5
109 Manuel
105 Natalia
107 Jhoser
108 Jhoel
106 Carlos
*/
