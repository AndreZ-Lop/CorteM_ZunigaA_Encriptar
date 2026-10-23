/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cortem_zunigaa_encriptar;

import java.util.List;

/**
 *
 * @author c
 */
public class CorteM_ZunigaA_Encriptar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String palabraPrueba = Operacion.encriptar("HELLo", 3, (texto,desplazamiento) -> Algoritmos.desplazamiento(texto.toUpperCase(), desplazamiento));
       System.out.println(palabraPrueba);
       
       List<Integer> encriptadoPorBit = Operacion.encriptar("HELLO", "KEY", (texto,key) -> Algoritmos.algortimoPorBit(texto.toUpperCase(), key.toUpperCase()));
        System.out.println(encriptadoPorBit);
    }
    
}
