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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("ingrese dos numero enteros positivos: ");
            num1 = leer.nextInt();
            num2 = leer.nextInt();

            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:System.out.println("La suma es: " + (num1 + num2));break;
                case 2:System.out.println("La resta es: " + (num1 - num2));break;
                case 3:System.out.println("La multiplicacion es: " + (num1 * num2));break;
                case 4: if (num2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                        continue; // vuelve al inicio del ciclo y solicita los números nuevamente
                    }
                    System.out.println("La división es: " + ((double) num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa (S/N)?");
                    String respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("S")){
                        salir = true;
                    }
                    break;
                default:System.out.println("Opcion invalida.");
            }
        }
        System.out.println("Fin del programa");
    }

}
