import java.util.Scanner;

public class EjerciciosJava {
static void ejercicio5() {
        double[][] notas = new double[3][4];
        double[] promedios = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("--- Estudiante " + (i + 1) + " ---");
            double suma = 0;

            for (int j = 0; j < 4; j++) {
                System.out.print("Nota de la materia " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
                suma = suma + notas[i][j];
            }

            promedios[i] = suma / 4;
        }

        System.out.println("\nPromedios:");
        int mejor = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + promedios[i]);
            if (promedios[i] > promedios[mejor]) {
                mejor = i;
            }
        }

        System.out.println("El mejor promedio es del estudiante " + (mejor + 1)
                + " con " + promedios[mejor]);
    }}