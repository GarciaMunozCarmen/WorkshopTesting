package es.fplumara.dam1.worshoptesting.core.calculator;

import es.fplumara.dam1.workshoptesting.core.calculator.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll // Se ejecuta siempre antes de los test
    public static void setUp() {
          calculator = new Calculator();
    }

    @Test
    public void divisionEnteraPorero(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(4,0);
        });
        assertEquals("División por cero no permitida",ex.getMessage());

    }

}
