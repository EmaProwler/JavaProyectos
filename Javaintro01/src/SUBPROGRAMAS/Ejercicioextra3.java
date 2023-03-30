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
public class Ejercicioextra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("ingrese una cantidad de euros: ");
        double cantidadeuros = leer.nextDouble();
        leer.nextLine();

        System.out.print("Introduce la moneda que quieras convertir (libras, dolares o yenes): ");
        String moneda = leer.nextLine();

        convertirmoneda(cantidadeuros, moneda);

        leer.close();
    }

    public static void convertirmoneda(double cantidadeuros, String moneda) {
        double cantidadconvertida = 0.0;
        String mensaje = "";

        switch (moneda.toLowerCase()) {
            case "libras":
                cantidadconvertida = cantidadeuros * 0.86;
                mensaje = cantidadeuros + " E son " + cantidadconvertida + " libras.";
                break;
            case "dolares":
                cantidadconvertida = cantidadeuros * 1.28611;
                mensaje = cantidadeuros + " E son " + cantidadconvertida + " dolares.";
                break;
            case "yenes":
                cantidadconvertida = cantidadeuros * 129.852;
                mensaje = cantidadeuros + " E son " + cantidadconvertida + " yenes.";
                break;
            default:
                mensaje = "La moneda introducida no es valida.";
        }
        System.out.println(mensaje);
    }
}
