import java.util.Scanner;

public class Ejercicio08 {

    // Pide n notas y devuelve la suma
    public static double leerNotas(Scanner sc, int n) {
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Nota " + i + ": ");
            suma += sc.nextDouble();
        }
        return suma;
    }

    // Calcula el promedio
    public static double calcularPromedio(double suma, int n) {
        return suma / n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas notas? ");
        int cantidad = sc.nextInt();

        double total = leerNotas(sc, cantidad);
        System.out.println("Promedio: " + calcularPromedio(total, cantidad));
    }
}
