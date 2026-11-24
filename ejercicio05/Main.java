// Ejercicio 5: Arquitectura hexagonal, SOLID y MVC (teoría)
//
// 1. Puertos y adaptadores:
//    Los puertos son interfaces que definen cómo se comunica el exterior
//    con la lógica de negocio. Los adaptadores son las implementaciones que
//    conectan esos puertos con tecnologías concretas, como una base de datos
//    o una interfaz de usuario.
//
// 2. Responsabilidad Única (la "S" de SOLID):
//    Cada clase o módulo debe tener una sola responsabilidad,
//    es decir, una sola razón para cambiar.
//
// 3. Diferencia entre multicapa y MVC:
//    La multicapa divide la aplicación en capas (presentación, negocio, datos),
//    mientras que MVC separa la aplicación en Modelo, Vista y Controlador,
//    y se enfoca en la interacción con el usuario.

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Puertos: interfaces para comunicarse con la lógica de negocio.");
        System.out.println("   Adaptadores: implementaciones que conectan los puertos con tecnologías concretas.");
        System.out.println();
        System.out.println("2. Responsabilidad Única: cada clase debe tener una sola razón para cambiar.");
        System.out.println();
        System.out.println("3. Multicapa: capas (presentación, negocio, datos).");
        System.out.println("   MVC: Modelo, Vista y Controlador, enfocado en la interacción con el usuario.");
    }
}
