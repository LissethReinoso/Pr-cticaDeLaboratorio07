/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.desencriptar;

import java.util.HashMap;

/**
 *
 * @author nicol
 */
public class Diccionario {
     public HashMap criptograma(){
        
        HashMap diccionario = new HashMap();
        
        diccionario.put('a', 'z'); 
        diccionario.put('b', 'y'); 
        diccionario.put('c', 'x'); 
        diccionario.put('d', 'w'); 
        diccionario.put('e', 'v'); 
        diccionario.put('f', 'u'); 
        diccionario.put('g', 't'); 
        diccionario.put('h', 's'); 
        diccionario.put('i', 'r'); 
        diccionario.put('j', 'q'); 
        diccionario.put('k', 'p'); 
        diccionario.put('l', 'o'); 
        diccionario.put('m', 'ñ'); 
        diccionario.put('n', 'n'); 
        diccionario.put('ñ', 'm'); 
        diccionario.put('o', 'l'); 
        diccionario.put('p', 'k'); 
        diccionario.put('q', 'j'); 
        diccionario.put('r', 'i'); 
        diccionario.put('s', 'h'); 
        diccionario.put('t', 'g'); 
        diccionario.put('u', 'f'); 
        diccionario.put('v', 'e'); 
        diccionario.put('w', 'd'); 
        diccionario.put('x', 'c'); 
        diccionario.put('y', 'b'); 
        diccionario.put('z', 'a');
        
        diccionario.put('A', 'Z'); 
        diccionario.put('B', 'Y'); 
        diccionario.put('C', 'X'); 
        diccionario.put('D', 'W'); 
        diccionario.put('E', 'V'); 
        diccionario.put('F', 'U'); 
        diccionario.put('G', 'T'); 
        diccionario.put('H', 'S'); 
        diccionario.put('I', 'R'); 
        diccionario.put('J', 'Q'); 
        diccionario.put('K', 'P'); 
        diccionario.put('L', 'O'); 
        diccionario.put('M', 'Ñ'); 
        diccionario.put('N', 'N'); 
        diccionario.put('Ñ', 'M'); 
        diccionario.put('O', 'L'); 
        diccionario.put('P', 'K'); 
        diccionario.put('Q', 'J'); 
        diccionario.put('R', 'I'); 
        diccionario.put('S', 'H'); 
        diccionario.put('T', 'G'); 
        diccionario.put('U', 'F'); 
        diccionario.put('V', 'E'); 
        diccionario.put('W', 'D'); 
        diccionario.put('X', 'C'); 
        diccionario.put('Y', 'B'); 
        diccionario.put('Z', 'A');
 
        diccionario.put('0', '9');
        diccionario.put('1', '8');
        diccionario.put('2', '7');
        diccionario.put('3', '6');
        diccionario.put('4', '5');
        diccionario.put('5', '4');
        diccionario.put('6', '3');
        diccionario.put('7', '2');
        diccionario.put('8', '1');
        diccionario.put('9', '0');
     
        diccionario.put(' ', ' ');
        
        diccionario.put('\n', '\n');
        
        return diccionario;
    }
}
