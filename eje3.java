import java.util.Scanner;

public class EjerciciosJava {
static void ejercicio3() {
        int contador = 0;
        int pares = 0;
        int impares = 0;

        while (contador < 8) {
            System.out.print("Numero " + (contador + 1) + ": ");
            int n = sc.nextInt();

            if (n % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            contador++;
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }}
