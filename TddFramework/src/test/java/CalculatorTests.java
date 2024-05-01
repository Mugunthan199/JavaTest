import com.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

public class CalculatorTests {
    @Test
    public void add_fail_test() {
        Calculator calculator = new Calculator();
        int expectedValue = 80;
        int actual = calculator.add(40, -40);
        Assert.assertNotEquals(expectedValue, actual);
    }

    @Test
    public void add_pass_test() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(40, 40);
        Assert.assertEquals(40 + 40, actual);
    }

    @Test
    public void add_negative_numbers_test() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(-40, -40);
        Assert.assertEquals(-80, actual);
    }

    @Test
    public void sub_pass_test() {
        Calculator calculator = new Calculator();
        int actual = calculator.sub(160, 40);
        Assert.assertEquals(160 - 40, actual);
    }

    @Test
    public void sub_negative_with_positive_numbers_pass_test() {
        Calculator calculator = new Calculator();
        int actual = calculator.sub(-40, 40);
        Assert.assertEquals(-80, actual);
    }

    @Test
    public void sub_negative_with_negative_numbers_pass_test() {
        Calculator calculator = new Calculator();
        int actual = calculator.sub(-40, -40);
        Assert.assertEquals(0, actual);
    }
    @Test
    public void mul_pass_test() {
        Calculator calculator = new Calculator();
        int actual = calculator.multiply(20, 10);
        Assert.assertEquals(20 * 10, actual);
    }

    @Test
    public void mul_by_zero_test() {
        Calculator calculator = new Calculator();
        int actual = calculator.multiply(20, 0);
        Assert.assertEquals(0, actual);
    }

    @Test
    public void div_pass_test() {
        Calculator calculator = new Calculator();
        int actual = (int) calculator.divide(100, 10);
        Assert.assertEquals(100 / 10, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        Calculator calculator = new Calculator();
        calculator.divide(6, 0);
    }
}
