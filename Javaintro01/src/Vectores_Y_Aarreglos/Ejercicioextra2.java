package Vectores_Y_Aarreglos;

import java.util.Scanner;
import java.util.Random;

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
        Random random = new Random();
        
        //Pedir al usuario la cantidad de elementos en el vector
        System.out.print("Ingrese el tamaño del vector:");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
    
        //Llenar el vector con valores aleatorios
        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(100);
            
        }
        //Pedir al usuario el numero a buscar
        
        System.out.print("Ingrese el numero para buscar en el vector: ");
        int numero = leer.nextInt();
        
        //buscar el numero en el vector y mostrar su posicion
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if(vector[i] == numero){
                System.out.println("El numero se encuentra en la posicion " + i);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("El numero no se encuentra en el vector");
        }else{
            int repeticiones = 0;
            for (int i = 0; i < n; i++) {
                if(vector[i] == numero){
                    repeticiones++;
                }
            }
            if (repeticiones > 1){
                System.out.println("el numero esta repetido en el vector");
            }else{
                System.out.println("el numero no esta repetido en el vector");
            }
        }
    }
}