/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores_Y_Aarreglos;

import java.util.Scanner;

/**
 *
 * @author Ema
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de compañeros de equipo: ");
        int n = leer.nextInt();

        String[] equipo = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el nombre del compañero " + (i+1) + ": ");
            equipo[i] = leer.next();
        }
        System.out.println("El equipo esta conformado por : ");
        for (int i = 0; i < n; i++) {
            System.out.println(equipo[i]);
        }
        leer.close();
    }

}
