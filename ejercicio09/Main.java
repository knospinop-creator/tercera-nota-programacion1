// Ejercicio 9: UML
//
// DIAGRAMA DE CLASES
//
// +------------------+
// |     Persona      |
// +------------------+
// | - nombre: String |
// | - id: String     |
// +------------------+
// | + getNombre()    |
// | + getId()        |
// +------------------+
//       /|\               /|\
//        |                 |
// +----------------+   +----------------------+
// |    Usuario     |   |    Bibliotecario     |
// +----------------+   +----------------------+
// | - prestamos:int|   | - turno: String      |
// +----------------+   +----------------------+
// | + pedirLibro() |   | + registrarPrestamo()|
// +----------------+   | + recibirLibro()     |
//         |            +----------------------+
//         | pide prestado
//         v
// +------------------+
// |      Libro       |
// +------------------+
// | - titulo: String |
// | - autor: String  |
// | - prestado: bool |
// +------------------+
// | + prestar()      |
// | + devolver()     |
// +------------------+
//
// DIAGRAMA DE SECUENCIA: reservar un libro
//
// Usuario        Bibliotecario        Libro
//    |                 |                |
//    |-- reservar() -->|                |
//    |                 |-- revisar() -->|
//    |                 |<-- disponible -|
//    |                 |-- prestar() -->|
//    |<-- confirmación-|                |

abstract class Persona {
    private String nombre;
    private String id;

    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
}

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

class Usuario extends Persona {
    private int prestamos;

    public Usuario(String nombre, String id) {
        super(nombre, id);
        this.prestamos = 0;
    }

    public void pedirLibro(Libro libro, Bibliotecario bibliotecario) {
        if (bibliotecario.registrarPrestamo(libro)) {
            prestamos++;
            System.out.println(getNombre() + " reservó: " + libro.getTitulo());
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public int getPrestamos() {
        return prestamos;
    }
}

class Bibliotecario extends Persona {
    private String turno;

    public Bibliotecario(String nombre, String id, String turno) {
        super(nombre, id);
        this.turno = turno;
    }

    public boolean registrarPrestamo(Libro libro) {
        if (!libro.isPrestado()) {
            libro.prestar();
            return true;
        }
        return false;
    }

    public void recibirLibro(Libro libro) {
        libro.devolver();
    }
}

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan Pérez", "12345");
        Bibliotecario bibliotecario = new Bibliotecario("Marta", "B001", "Mañana");
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes");

        usuario.pedirLibro(libro, bibliotecario);
        usuario.pedirLibro(libro, bibliotecario); // ya está prestado
        System.out.println("Préstamos del usuario: " + usuario.getPrestamos());
    }
}
