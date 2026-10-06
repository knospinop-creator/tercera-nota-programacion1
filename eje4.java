import java.util.Scanner;

public class EjerciciosJava {
static void ejercicio4() {
        int[][] matriz = new int[3][3];
        int sumaDiagonal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nTu matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // la diagonal principal es cuando fila == columna
        for (int i = 0; i < 3; i++) {
            sumaDiagonal = sumaDiagonal + matriz[i][i];
        }

        System.out.println("Suma de la diagonal principal: " + sumaDiagonal)
    }}