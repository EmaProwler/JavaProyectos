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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String entrada = "";
        int correctas = 0;
        int incorrectas = 0;
        
        while(true){
            System.out.print("Introduzca una cadena (&&&&& para finalizar): ");
            entrada = leer.nextLine();
            if(entrada.equals("&&&&&")){
                break;
            }
            if (entrada.length() == 5 && entrada.substring(0,1).equals("X") && entrada.substring(4,5).equals("O")){
                correctas++;
            }else {
                incorrectas++;
            }
        }
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    }

}
