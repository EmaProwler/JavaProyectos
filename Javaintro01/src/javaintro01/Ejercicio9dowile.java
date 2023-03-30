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
public class Ejercicio9dowile {
    
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        int numero, suma = 0, i = 0;
        
        do{
            System.out.println("ingrese un numero");
            numero = leer.nextInt();
            if (numero == 0){
                System.out.println("Se capturo el numero cero.");
                break;
            }
            if (numero > 0){
                suma += numero;
            }
            
            i++;
            
        }while (i < 20);
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}
