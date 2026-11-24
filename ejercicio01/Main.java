// Ejercicio 1: Clases y objetos (P.O.O)

class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        prestado = true;
    }

    public void devolver() {
        prestado = false;
    }
}

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes");
        System.out.println("¿Libro prestado? " + libro.isPrestado());
        libro.prestar();
        System.out.println("¿Libro prestado? " + libro.isPrestado());
        libro.devolver();
        System.out.println("¿Libro prestado? " + libro.isPrestado());
    }
}
