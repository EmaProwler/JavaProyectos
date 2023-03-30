/*
Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de 
los números introducidos supere el límite inicial.
 */
package ESTRUCTURADECONTROL;

import java.util.Scanner;

/**
 *
 * @author Ema
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un valor limite: ");
        int limite = leer.nextInt();
        int suma = 0;
        int contador = 0;

        while (suma < limite) {
            System.out.println("ingrese un numero: ");
            int numero = leer.nextInt();
            suma += numero;
            contador++;

        }
        System.out.println("la suma de los " + contador + " numeros ingresadors supera el limite de " + limite);

    }

}
