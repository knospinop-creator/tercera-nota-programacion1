import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Suma de los primeros N números
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese N: ");
        int n = sc.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma es: " + suma);
    }
}
