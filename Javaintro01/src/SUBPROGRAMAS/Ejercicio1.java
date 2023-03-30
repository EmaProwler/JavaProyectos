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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase para codificar: ");
        String frase = leer.nextLine();
        System.out.println(frase);

        String frasecodificada = codificarfrase(frase);
        
        System.out.println("La frase codificada es: ");
        System.out.println(frasecodificada);
        
        leer.close();
    }

    public static String codificarfrase(String frase) {
        String frasecodificada = "";

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            switch (letra) {
                case 'a':
                case 'A':
                    frasecodificada = frasecodificada + "@";
                    break;
                case 'e':
                case 'E':
                    frasecodificada += "#";
                    break;
                case 'i':
                case 'I':
                    frasecodificada += "$";
                    break;
                case 'o':
                case 'O':
                    frasecodificada += "%";
                    break;
                case 'u':
                case 'U':
                    frasecodificada += "*";
                    break;
                default:
                    if (letra == 'á' || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú'
                            || letra == 'Á' || letra == 'É' || letra == 'Í' || letra == 'Ó' || letra == 'Ú') {
                        frasecodificada += letra;
                    } else {
                        frasecodificada += letra;
                    }

            }
        }
        return frasecodificada;
    }
}