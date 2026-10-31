import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        // Contar números pares e impares del 1 al N
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese N: ");
        int n = sc.nextInt();

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}
