// Ejercicio 10: Pruebas unitarias con JUnit 5

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.restar(5, 3));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(12, calc.multiplicar(3, 4));
    }

    @Test
    public void testNumerosNegativos() {
        Calculadora calc = new Calculadora();
        assertEquals(-1, calc.sumar(-3, 2));
    }
}
