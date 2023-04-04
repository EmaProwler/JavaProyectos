package biblioteca.entidades;

import java.util.Scanner;

/**
 *
 * @author Ema-Prowler
 */
public class Libro {

    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void cargarlibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el isbn del libro: ");
        isbn = leer.nextInt();
        leer.nextLine();//vaciar el buffer en teoria
        System.out.println("ingrese el titulo del libro: ");
        titulo = leer.nextLine();
        System.out.println("ingrese el autor del libro: ");
        autor = leer.nextLine();
        System.out.println("ingrese el numero de paginas del libro: ");
        paginas = leer.nextInt();
    }

    public void mostrardatos() {
        System.out.println("Isbn del libro: " + this.isbn);
        System.out.println("Titulo del libro: " + this.titulo);
        System.out.println("Autor del libro: " + this.autor);
        System.out.println("Numero de paginas del libro: " + this.paginas);
    }
}
