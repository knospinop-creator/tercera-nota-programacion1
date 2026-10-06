
import java.util.Scanner;

public class EjerciciosJava {static void ejercicio1() {
        double[] notas = new double[5];
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma = suma + notas[i];
        }

        double promedio = suma / notas.length;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);

        if (promedio >= 3.0) {
            System.out.println("Aprobaste :)");
        } else {
            System.out.println("Toca mejorar :(");
        }
    }}