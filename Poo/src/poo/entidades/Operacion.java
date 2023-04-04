package Poo.entidades;

import java.util.Scanner;

/**
 *
 * @author Ema-Prowler
 */
public class Operacion {

    private float numero1;
    private float numero2;

    public Operacion(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public float getNumero1() {
        return numero1;

    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer numero: ");
        this.numero1 = leer.nextFloat();
        System.out.println("Ingrese el valor del segundo numero: ");
        this.numero2 = leer.nextFloat();

    }

    public float sumar() {
        return this.numero1 + this.numero2;
    }

    public float restar() {
        return this.numero1 - this.numero2;
    }

    public float multiplicar() {
        if (this.numero2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero");
            return 0;
        } else {
            return this.numero1 * this.numero2;
        }
    }
    public float dividir(){
        if(this.numero2 == 0){
            System.out.println("Error: no se puede dividir por cero");
            return 0;
        }else{
            return this.numero1 / this.numero2;
        }
        
    }
}
