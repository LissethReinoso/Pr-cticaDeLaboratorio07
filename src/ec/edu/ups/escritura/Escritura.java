/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.escritura;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nico
 * @author Liss
 */
public class Escritura {
     public void leer(String texto, String ruta) throws IOException{
        try {
            FileWriter archivoEscritura = new FileWriter(ruta, false);
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            escritura.append(texto);
            escritura.close();
            archivoEscritura.close();
        } catch (FileNotFoundException e1) {
            System.out.println("Ruta no encontrada");
        } catch (IOException e2){
            System.out.println("Error de escritura");
        } catch (Exception e3){
            System.out.println("Error general");
        }
    }
}
