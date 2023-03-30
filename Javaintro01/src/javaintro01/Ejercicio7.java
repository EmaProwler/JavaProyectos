package javaintro01;

import java.util.Scanner;

/**
 *
 * @author Ema
 */
public class Ejercicio7 {
    
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        int tipomotor;
        System.out.println("Ingrese una opcion");
        
        tipomotor = leer.nextInt();
        
        switch (tipomotor){
            case 1: System.out.println("“La bomba es una bomba de agua"); break ;
            case 2: System.out.println("“La bomba es una bomba de gasolina"); break ;
            case 3: System.out.println("“La bomba es una bomba de hormigon"); break ;
            case 4: System.out.println("“La bomba es una bomba de pasta alimenticia"); break ;
            
            default: System.out.println("No existe un valor válido para tipo de bomba");
        }   
    }
}
