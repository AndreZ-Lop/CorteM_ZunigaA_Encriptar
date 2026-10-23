/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cortem_zunigaa_encriptar;

import java.util.function.BiFunction;

public class Operacion {
    public static <T,U,R> R encriptar(T mensaje,U clave,BiFunction<T,U,R> operacion){
        return operacion.apply(mensaje, clave);
    }
}
