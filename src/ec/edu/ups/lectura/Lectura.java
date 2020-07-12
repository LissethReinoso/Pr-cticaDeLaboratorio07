/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.lectura;

import ec.edu.ups.desencriptar.Desencriptar;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;

/**
 *
 * @author nicol
 */
public class Lectura {

    public String leer(String ruta) throws IOException {
        String lineas = "";
        try {
            String linea = "";
            FileReader archivoLectura = new FileReader(ruta);
            BufferedReader lectura = new BufferedReader(archivoLectura);
            while (linea != null) {
                linea = lectura.readLine();
                if(linea != null){
                    lineas = lineas.concat(linea) + "\n";
                }
            }
            lectura.close();
            archivoLectura.close();
        } catch (FileNotFoundException e1) {
            System.out.println("Ruta de archivo no encontrada");
        } catch (IOException e2) {
            System.out.println("Error de lectura");
        } catch (Exception e3) {
            System.out.println("Error general");
        }
        return lineas;
    }

}
