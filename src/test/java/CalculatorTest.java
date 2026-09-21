import code.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {

        double result = calculator.add(10, 20);

        assertEquals(30, result);
    }

    @Test
    void testSubtraction() {

        double result = calculator.subtract(20, 10);

        assertEquals(10, result);
    }

    @Test
    void testMultiplication() {

        double result = calculator.multiply(10, 5);

        assertEquals(50, result);
    }

    @Test
    void testDivision() {

        double result = calculator.divide(20, 5);

        assertEquals(4, result);
    }

    @Test
    void testDecimalAddition() {

        double result = calculator.add(10.5, 5.5);

        assertEquals(16, result);
    }

    @Test
    void testDivisionByZero() {

        assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );
    }
}