package mascotaapp;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

/**
 *
 * @author Ema-Prowler
 */
public class MascotaAPP {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Mascota m1 = new Mascota(leer.next(), leer.next(), leer.next());

        System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo + " " + m1.nombre + " ");
    }

}
