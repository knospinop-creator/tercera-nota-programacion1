// Ejercicio 2: Herencia y polimorfismo

class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}

class Desarrollador extends Empleado {
    private double bonificacion;

    public Desarrollador(String nombre, double salario, double bonificacion) {
        super(nombre, salario);
        this.bonificacion = bonificacion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Bonificación: $" + bonificacion);
        System.out.println("Salario total: $" + (getSalario() + bonificacion));
    }
}

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", 2000);
        Empleado dev = new Desarrollador("Laura", 3000, 500);

        empleado.mostrarInfo();
        System.out.println();
        dev.mostrarInfo();
    }
}
