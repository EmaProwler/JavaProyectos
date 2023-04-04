package Vectores_Y_Aarreglos;

import java.util.Random;

/**
 *
 * @author Ema
 */
public class Ejercicioextra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int[][] matriztranspuesta = new int[4][4];
        Random aleatorio = new Random();

        //Llenamos la matriz con valores aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(100);//Valor aleatorio entre 0 y 100
            }
        }
        //Mostramos la matriz original
        System.out.println("Matriz original:");
        mostrarmatriz(matriz);
        
        //obtenemos la matriz transpuesta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriztranspuesta[j][i] = matriz[i][j];
            }
        }
        //mostramos la matriz transpuesta
        System.out.println("\nmatriz transpuesta:");
        mostrarmatriz(matriztranspuesta);
    }
        //funcion para mostrar una matriz en consola
    public static void mostrarmatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
    }
}
