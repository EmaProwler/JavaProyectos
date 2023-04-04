package poo.entidades;

import java.util.Scanner;

/**
 *
 * @author Ema-Prowler
 */
public class Rectangulo {

    private float base;
    private float altura;
    //constructor completo

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    //constructor vacio
    public Rectangulo() {
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void CrearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("digite la base del rectangulo: ");
        this.base = leer.nextFloat();
        System.out.println("Digite la altura del Rectangulo: ");
        this.altura = leer.nextFloat();
    }
    public void superficie(){
        
    }

}
