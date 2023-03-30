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
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int num = leer.nextInt();
        
        if(num % 2 == 0){
            System.out.println(num +" es un numero par.");
        }
        else{
            System.out.println(num+ " es un numero impar.");
        }   
    }   
}
