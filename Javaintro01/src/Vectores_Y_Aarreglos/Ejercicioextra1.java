package Vectores_Y_Aarreglos;

public class Ejercicioextra1 {

    public static void main(String[] args) {
        int n = 100;
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = i + 1;
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }

}
