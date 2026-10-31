import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        // Mayor y menor de una serie de números
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números? ");
        int n = sc.nextInt();

        System.out.print("Número 1: ");
        int primero = sc.nextInt();
        int mayor = primero;
        int menor = primero;

        for (int i = 2; i <= n; i++) {
            System.out.print("Número " + i + ": ");
            int numero = sc.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}
