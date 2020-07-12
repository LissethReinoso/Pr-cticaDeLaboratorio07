/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.encriptar;

import java.util.HashMap;

/**
 *
 * @author Nico
 * @author Liss
 */
public class Encriptar {
   char array[];

    Diccionario d;

    HashMap diccionario;

    public String texto(String texto) {

        array = texto.toCharArray();

        d = new Diccionario();

        diccionario = d.criptograma();

        for (int i = 0; i < array.length; i++) {
            char a = (char) diccionario.get(array[i]);
            array[i] = a;
        }
        String encriptado = String.valueOf(array);

        return encriptado;
    }
    
}
