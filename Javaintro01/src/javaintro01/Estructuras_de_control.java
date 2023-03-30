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
public class Estructuras_de_control {
    
    public static void main(String[] args) {
        
        Scanner leer = new  Scanner(System.in);
        
        int num1;
        int num2;
        System.out.println("ingrese el valor del primer numero: ");
        num1 = leer.nextInt();
        System.out.println("ingrese su segundo numero: ");
        num2 = leer.nextInt();
        if (num1 < num2) { 
        System.out.println("La variable num1 aloja un número menor a la variable num2"); 
        }else { 
        System.out.println("La variable num1 aloja un número mayor a la variable num2");
        
    }
}
}