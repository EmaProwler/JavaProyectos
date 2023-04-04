package calculadora.entidades;

import java.util.Scanner;

/**
 *
 * @author Ema-Prowler
 */
public class Circunferencia {
       private float radio;
       private final float PI = (float) 3.14;

    public Circunferencia(float radio) {
        this.radio = radio;
    }
    public float getRadio(){
        return radio;
    }
    public void setRadio(float radio){
        this.radio = radio;
    }
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = leer.nextFloat();
    }
    public float area(){
       return (float) (PI * Math.pow(radio, 2)); 
    }
    public float perimetro(){
        return 2 * PI * radio;
    }
}
