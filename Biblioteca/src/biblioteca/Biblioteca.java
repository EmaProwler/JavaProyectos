package biblioteca;

import biblioteca.entidades.Libro;

/**
 *
 * @author Ema-Prowler
 */
public class Biblioteca {

   
    public static void main(String[] args) {
    Libro libro = new Libro();
    libro.cargarlibro();
    libro.mostrardatos();
    }
}
