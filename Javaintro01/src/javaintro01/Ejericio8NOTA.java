/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;

import java.util.Scanner ;


/**
 *
 * @author Ema
 */
public class Ejericio8NOTA {
    
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        int respuesta;
        
        System.out.println("Ingrese una nota entre el 0 al 10 :");
        
        respuesta = leer.nextInt();
        
        while (respuesta < 0 || respuesta > 10){
            System.out.println("Esta fuera del rango 0 a 10 , ingrese nueva mente:");
            respuesta = leer.nextInt();
        }
        System.out.println("El valor ingresado (" + respuesta + ") se encuentra dentro del rango 0 a 10.");
    }
}