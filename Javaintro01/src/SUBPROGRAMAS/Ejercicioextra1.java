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
public class Ejercicioextra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero: ");
        int num1 = leer.nextInt();
        System.out.println("ingrese un segundo numero entero: ");
        int num2 = leer.nextInt();
        System.out.println("ahora ingrese el numero de una opcion para calcular: ");
        System.out.println("menu:");
        System.out.println("1:sumar");
        System.out.println("2:restar");
        System.out.println("3:multiplicar");
        System.out.println("4:dividir");
        System.out.println("seleccione una opcion: ");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                int suma = sumar(num1, num2);
                System.out.println(suma);
                break;
            case 2:
                int resta = restar(num1, num2);
                System.out.println(resta);
                break;
            case 3:
                int multiplicacionn = multiplicacion(num1, num2);
                System.out.println(multiplicacionn);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("NO SE PUEDE DIVIDIR ENTRE CERO -.-'' ");
                } else {
                    int dividir = division(num1, num2);
                    System.out.println(dividir);
                }
                break;
            default:
                System.out.println("OPERACION NO VALIDA");
                break;

        }
        leer.close();
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }
}
