/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SUBPROGRAMAS;

import java.util.Scanner;

/**
 *
 * @author Ema
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        int num2 = leer.nextInt();
        leer.close();
        esmultiplo(num1, num2);
    }

    public static void esmultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es multiplo de " + num2);
        } else {
            System.out.println(num1 + " no es multiplo de " + num2);
        }
    }

}
