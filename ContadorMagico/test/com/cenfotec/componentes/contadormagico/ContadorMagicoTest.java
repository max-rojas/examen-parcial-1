/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cenfotec.componentes.contadormagico;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



/**
 *
 * @author MAXVINICIOROJASTORRE
 */
public class ContadorMagicoTest {
    
    private ContadorMagicoMotor contadorMagico = new ContadorMagicoMotor();
    
    private final String patron = "abcdefghijklmnopqrstuvwxyz";
    private final String palabraDePrueba1 = "alpakuz";
    private final String palabraDePrueba2 = "foda";
    
    @Test
    public void pruebaPalabra1() {
    
        int resultadoEsperado = 55;
        int resultado = this.contadorMagico.procesar(patron, palabraDePrueba1);
        
        assertEquals(resultadoEsperado, resultado);
    }
    
    @Test
    public void pruebaPalabra2() {
    
        int resultadoEsperado = 28;
        int resultado = this.contadorMagico.procesar(patron, palabraDePrueba2);
        
        assertEquals(resultadoEsperado, resultado);
    }

}
