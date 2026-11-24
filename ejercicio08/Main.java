// Ejercicio 8: Persistencia en archivos

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ruta = "notas.txt";
        Scanner sc = new Scanner(System.in);

        // Escribir las notas
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + ": ");
                String nota = sc.nextLine();
                writer.write(nota);
                writer.newLine();
            }
            System.out.println("Notas guardadas.");
        } catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        }

        // Leer las notas
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            System.out.println("Notas guardadas en el archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println("- " + linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }
}
