/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ESTRUCTURADECONTROL;

import java.util.Scanner;

/**
 *
 * @author Ema
 */
public class Ejercicio2 {
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una palabra o frase");
        String nombre = leer.nextLine();
        
        if(nombre.equals("eureka")){
            System.out.println("la frase escrita es !eureka¡ CORRECTO ");
        }
        else{System.out.println("La frase no es eureka INCORRECTO");}
    }
    
}
