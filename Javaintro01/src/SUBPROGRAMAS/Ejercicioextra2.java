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
public class Ejercicioextra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta = "Si";

        while (respuesta.equalsIgnoreCase("Si")) {
            System.out.print("ingrese el numerod e personas"); //muestra en pantalla el mensaje
            int n = leer.nextInt();
            leer.nextLine();// esto limpiara el buffer del scanner

            for (int i = 0; i < n; i++) {
                System.out.print("ingrese el nombre de la persona" + (i + 1) + ": ");
                String nombre = leer.nextLine();

                System.out.println("Ingrese la edad de " + nombre + ": ");
                int edad = leer.nextInt();
                leer.nextLine(); //limpiar el buffer del scanner

                System.out.println(nombre + " tiene " + edad + " Años.");

                if (edad >= 18) {
                    System.out.println(nombre + " es mayor de edad.");
                } else {
                    System.out.println(nombre + " es menor de edad.");
                }
            }
            System.out.println("¿Quieres segur mostrando personas? (si/no): ");
            respuesta = leer.nextLine();
        }
        leer.close();
    }

}