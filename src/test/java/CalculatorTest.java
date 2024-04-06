import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    private Long a = 5L;
    private Long b = 2L;

    @Test
    public void testAdd() {
        Long addResult = calculator.add(a, b);
        assertEquals(a + b, addResult);
    }

    @Test
    public void testSubtract() {
        Long subtractResult = calculator.subtract(a, b);
        assertEquals(a - b, subtractResult);
    }

    @Test
    public void testMultiply() {
        Long multiplyResult = calculator.multiply(a, b);
        assertEquals(a * b, multiplyResult);
    }

    @Test
    public void testDivide() {
        double divideRresult = calculator.divide(a, b);
        assertEquals((double) a / b, divideRresult);
    }
}
