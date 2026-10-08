import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    //Se crea el objeto global para utilizarlo en varias pruebas. Es justo a calculator a quien vamos a probar
    Calculator calc = new Calculator();

    //Anotaciones se usan con el @
    @Test
    @DisplayName("Probando que 2 + 2 = 4")
    void addNumbers(){
        assertEquals(4,calc.add(2,2), "sumando 2 + 2");
    }

    /**
     * Test parametrizado
     * Es una forma de realizar múltiples pruebas de una vez
     * Vamos a ocupar la notación @ParameterizedTest
     */

    // {0}, {1} y {2} son placeholders que representan los argumentos y salida del método
    @ParameterizedTest(name = "{0} + {1} = {2}")

    /**
     * Aquí definimos los datos que van a ser probados en el siguiente orden
     * El primer argumento, el segundo argumento y el resultado esperado
     */
    @CsvSource({
            "3, 2, 5",
            "7, 3, 10",
            "25, 30, 55",
            "18, 21, 39"
    })
    void addNumbersP(int parametroA, int parametroB, int resultadoEsperado){
        assertEquals(resultadoEsperado, calc.add(parametroA,parametroB), () -> parametroA + " más " + parametroB + " debería ser igual a " + resultadoEsperado);
    }
    /*
     * Verifica que el resultado devuelto por calculator.add(...) sea igual al resultadoEsperado.
     * Si falla, el mensaje que verás en el test es algo como: "3 + 2 deberia ser 5"
     *
     * Nota: el mensaje de error está dentro de un Supplier (() -> ...), lo que significa que solo se construye si la prueba falla, haciendo el test un poco más eficiente.
     */

    @Test
    @DisplayName("Verificando que la división entre 0 de int arroja una excepción")
    void divideInts(){
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {int result = 10/0;});
        assertEquals("/ by zero", exception.getMessage());
    }


    @Test
    @DisplayName("Comprobando que la división de doubles entre 0 da infinito")
    void divideDouble(){
        assertEquals(Double.POSITIVE_INFINITY, calc.divide(1,0), "Debería ser infinito");
    }

    @Test
    //El @DisplayName no es obligatorio, es solo por si quieres que salga un texto que describa lo que estás probando.
    void validateClass(){
        assertInstanceOf(Calculator.class, calc);
    }
}
