/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cenfotec.componentes.contadormagico;

import java.util.ArrayList;

/**
 *
 * @author MAXVINICIOROJASTORRE
 */
public class ContadorMagicoMotor {
    
    private int contador;
    
    public Integer procesar(String patron, String palabra) {
        
            int indiceOrigen = 0;
            int indiceDestino = 0;
            contador = 0;
    
        for(char caracterDePalabra : palabra.toCharArray()) {           
            int saltos = 0;
            indiceDestino = patron.indexOf(caracterDePalabra);
            saltos += Math.abs(indiceOrigen - indiceDestino);
            
            this.contador += saltos;
            indiceOrigen = indiceDestino;
        }
        
        return this.contador;
    }
    
}
