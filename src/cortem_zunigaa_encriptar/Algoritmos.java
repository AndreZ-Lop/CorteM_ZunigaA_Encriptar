/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cortem_zunigaa_encriptar;

import java.util.ArrayList;
import java.util.List;

public class Algoritmos {
    public static String desplazamiento(String texto,Integer desplazamiento){
        List<Character> caracteresEncriptados = new ArrayList<>();
        for(char caracter: texto.toCharArray()){
            char caracterE = caracter;
            int ascii = caracterE;
            for(int i = 1; i <= desplazamiento;i++){
                ascii ++;
                if(ascii == 91){
                    ascii=65;
                }
            }
            caracterE = (char)ascii;
            caracteresEncriptados.add(caracterE);
        }
        
        System.out.println(texto.toCharArray());
        System.out.println(caracteresEncriptados);
        
        String palabraE = "";
        
        for(char caracter: caracteresEncriptados)
            palabraE = palabraE + caracter;
        return palabraE;
    }
    
    
    public static <T> List<Integer> algortimoPorBit(List<T> lista,String key){
        List<String> binariosP = new ArrayList<>(); 
        List<String> binariosK = new ArrayList<>(); 
        List<String> binariosR = new ArrayList<>(); 
        
       
        List<Integer> resultados = new ArrayList<>(); 

        for(int i = 0; i < lista.size(); i++){
            
            T elemento = lista.get(i);
            int caracterT = 0;
            if (elemento instanceof Character) {
                caracterT = (Character) elemento;
            } else if (elemento instanceof Integer) {
                caracterT = (Integer) elemento;
            } 
            char caracterK = key.charAt(i % key.length());
            
            binariosP.add(Integer.toBinaryString(caracterT));
            binariosK.add(Integer.toBinaryString(caracterK));
            
            int operacionXor = caracterT ^ caracterK;
            binariosR.add(Integer.toBinaryString(operacionXor));
            resultados.add(operacionXor);
        }
        
        System.out.println(binariosP);
        System.out.println(binariosK);
        System.out.println(binariosR);
        return resultados;
    }
}
