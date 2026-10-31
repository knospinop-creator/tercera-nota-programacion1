import java.util.Scanner;

public class Ejercicio06 {

    // Calcula el factorial de n
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        System.out.println(numero + "! = " + factorial(numero));
    }
}
