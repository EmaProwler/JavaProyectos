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
public class Ejercicio10FOR {
    
    public static void main(String[] args){
       
        Scanner leer = new Scanner (System.in);
        int numero;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("escriba un numero");
            numero = leer.nextInt();
            if (numero >= 1 && numero <= 20){
                System.out.println(numero + ": ");
                
                for (int j = 1; j <= numero; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                System.out.println("El numero ingresado no esta dentro del rango permitido");
            }
        }
    }
    
}
