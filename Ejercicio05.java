import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        // Validar una contraseña con while
        Scanner sc = new Scanner(System.in);
        String claveCorrecta = "1234";

        System.out.print("Ingrese la contraseña: ");
        String clave = sc.nextLine();

        while (!clave.equals(claveCorrecta)) {
            System.out.println("Incorrecta, intente de nuevo.");
            System.out.print("Ingrese la contraseña: ");
            clave = sc.nextLine();
        }

        System.out.println("Acceso concedido");
    }
}
