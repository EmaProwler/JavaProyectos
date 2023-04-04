package Juegos;

import java.util.Scanner;

/**
 *
 * @author Ema
 */
public class Adivinaelnumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner para leer valores
        Scanner leer = new Scanner(System.in);
        //instancias
        //mensaje de bienvenida
        saludo();
        int opcion = leer.nextInt();
        boolean condicion1 = false;
        while (condicion1) {
            switch (opcion) {
                case 1:
                    iniciar();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("no es ninguna de las opciones");
                    System.out.println("seleccione una opcion valida");
                    opcion = leer.nextInt();
                    if (opcion == 1 || opcion == 2 || opcion == 3){
                        condicion1= true;
                        continue;
                    }else{
                        System.out.println("sigue siendo una opcion invalida ");
                        System.out.println("ingrese una opcion valida");
                        opcion = leer.nextInt();
                        if (opcion ){
                            
                        }
                    }
                        
            }
        }
    }

    public static void saludo() {
        //Mensaje de bienvenida
        System.out.println("bienvenido a adivina el numero");
        System.out.println("se mostrara en pantalla el menu del juego");
        System.out.println("Menu:");
        System.out.println("1.Iniciar");
        System.out.println("2.ver puntaje");
        System.out.println("3.salir del juego");
        System.out.println("elige una opcion indicando su 'numero': ");
    }

    public static void iniciar() {

    }
}
