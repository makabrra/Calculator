import Calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorITest {

    @Test
    public void CalculatorTestMultiply() {
        Assertions.assertEquals(4, Calculator.multiply(2,2), "passed");
    }

    @Test
    public void CalculatorTestDivide() {
        Assertions.assertEquals(2, Calculator.divide(4,2), "passed");
    }

    @Test
    public void CalculatorTestMod() {
        Assertions.assertEquals(0, Calculator.modulo(4,2), "passed");
    }

}
