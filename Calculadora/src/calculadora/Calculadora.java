package calculadora;

import calculadora.entidades.Circunferencia;

/**
 *
 * @author Ema-Prowler
 */
public class Calculadora {

   
    public static void main(String[] args) {
     
        Circunferencia c = new Circunferencia((float) (0.0));
        c.crearCircunferencia();
        System.out.println("area de la circunferencia: " + c.area());
        System.out.println("perimetro de la circunferencia: "+ c.perimetro());
    }

}
