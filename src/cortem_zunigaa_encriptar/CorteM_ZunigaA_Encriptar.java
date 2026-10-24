/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cortem_zunigaa_encriptar;

import java.util.Arrays;
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
       
        List<Character> listaCaracteres = Arrays.asList('H','E','L','L','O');
        List<Integer> encriptadoPorBitC = Operacion.encriptar(listaCaracteres, "KEY", (texto,key) -> Algoritmos.algortimoPorBit(listaCaracteres, key.toUpperCase()));
        System.out.println(encriptadoPorBitC);
        
        
        List<Integer> listaEnteros = Arrays.asList(72, 69, 76, 76, 79);
        List<Integer> encriptadoPorBitE = Operacion.encriptar(listaEnteros, "KEY", (texto,key) -> Algoritmos.algortimoPorBit(listaEnteros, key.toUpperCase()));
        System.out.println(encriptadoPorBitE);
    }
    
}
