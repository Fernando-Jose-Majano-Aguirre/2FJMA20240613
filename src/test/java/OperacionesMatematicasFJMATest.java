import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMatematicasFJMATest {
    @Test
    public void testCalcularRaizCuadrada() {
        OperacionesMatematicasFJMA operaciones = new OperacionesMatematicasFJMA();

        // Caso 1: Calcular la raíz cuadrada de un número positivo
        double resultado = operaciones.calcularRaizCuadrada(4.0);
        assertEquals(2.0, resultado, 0.0001);

        // Caso 2: Calcular la raíz cuadrada de cero
        resultado = operaciones.calcularRaizCuadrada(0.0);
        assertEquals(0.0, resultado, 0.0001);

        // Caso 3: Calcular la raíz cuadrada de un número negativo (debe lanzar una excepción)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            operaciones.calcularRaizCuadrada(-1.0);
        });
        assertEquals("No se puede calcular la raíz cuadrada de un número negativo", exception.getMessage());
    }
}