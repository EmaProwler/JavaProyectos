package ESTRUCTURADECONTROL;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase de 8 caracteres");
        String frase = leer.nextLine();
        
        if (frase.length() == 8) {
            System.out.println("Correcto");
        }
        else {System.out.println("INCORRECTO");}
    }
}