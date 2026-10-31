import java.util.Scanner;

public class Ejercicio10 {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Salir");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                System.out.print("Primer número: ");
                double x = sc.nextDouble();
                System.out.print("Segundo número: ");
                double y = sc.nextDouble();

                if (opcion == 1) {
                    System.out.println("Resultado: " + sumar(x, y));
                } else if (opcion == 2) {
                    System.out.println("Resultado: " + restar(x, y));
                } else {
                    System.out.println("Resultado: " + multiplicar(x, y));
                }
            } else if (opcion != 4) {
                System.out.println("Opción inválida");
            }
        } while (opcion != 4);

        System.out.println("Hasta pronto");
    }
}
