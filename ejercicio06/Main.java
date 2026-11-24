// Ejercicio 6: Colecciones

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        paises.add("Colombia");
        paises.add("Perú");
        paises.add("Chile");
        paises.add("México");
        paises.add("Argentina");

        for (String pais : paises) {
            System.out.println("País: " + pais);
        }

        System.out.println("País en posición 2: " + paises.get(2));

        paises.remove("Chile");
        System.out.println("Lista después de eliminar: " + paises);

        HashSet<String> conjunto = new HashSet<>(paises);
        conjunto.add("Colombia"); // elemento repetido
        System.out.println("Conjunto: " + conjunto);

        // Explicación: el HashSet no permite elementos repetidos.
        // Al agregar "Colombia" por segunda vez, el conjunto lo ignora
        // y solo queda una vez.
    }
}
