/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author Ema
 */
public class Ejercicio8 {
    
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        String respuesta = "S";
        
        while(respuesta.equalsIgnoreCase("S")){
            System.out.println("desea continuar?");
            respuesta = leer.nextLine();
        }
    }
    
    
}
