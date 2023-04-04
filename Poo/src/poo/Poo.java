package Poo;

import Poo.entidades.Operacion;

/**
 *
 * @author Ema-Prowler
 */
public class Poo {

   
    public static void main(String[] args) {
     Operacion o = new Operacion();
     o.crearOperacion();
        System.out.println("Resultdo de la suma: " + o.sumar());
        System.out.println("Resultado de la resta: " + o.restar());
        System.out.println("Resultado de la multiplicacion: " + o.multiplicar());
        System.out.println("Resultado de la Division: " + o.dividir());
     
    }

}
