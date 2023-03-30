package Vectores_Y_Aarreglos;

import java.util.Scanner;

/**
 *
 * @author Ema
 */
public class Ejercicioextra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Pedir al usuario el tamaño del vector
        System.out.println("ingrese el tamaño del vector");
        int tamaniovector = leer.nextInt();

        int[] vector = new int[tamaniovector];

        //Pedir al usuario que rellene el vector o los elementos del vector
        System.out.print("Ingrese los elementos del vector: ");
        for (int i = 0; i < tamaniovector; i++) {
            vector[i] = leer.nextInt();

        }
        //contar los numeros con 1,2,3,4 o 5 digitos
        int[] contador = new int [5];
        for (int i = 0; i < tamaniovector; i++) {
            int digitos = contardigitos(vector[i]);
            if (digitos <= 5){
                contador[digitos - 1]++;
            }
        }
        //mostrar los resultados
        for (int i = 0; i < 5; i++) {
            System.out.println("hay " + contador[i] + " numeros de "+ (i+1) + " digito(s)");
        }
    }
//funcion que cuenta la cantidad de digitos de un numero
    public static int contardigitos(int numero){
        int digitos = 0;
        while (numero != 0){
            numero /= 10;
            digitos++;
            
        }
        return digitos;
    }
}
