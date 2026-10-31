import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Tabla de multiplicar de un número
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
