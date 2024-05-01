import com.calculator.Addition;
import com.calculator.Divide;
import com.calculator.Multiply;
import com.calculator.Subtract;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

public class CalculatorTests {
    @Test
    public void add_fail_test() {
        Addition a = new Addition();
        int expectedValue = 80;
        int actual = a.add(40, -40);
        Assert.assertNotEquals(expectedValue, actual);
    }

    @Test
    public void add_pass_test() {
        Addition a = new Addition();
        int actual = a.add(40, 40);
        Assert.assertEquals(40 + 40, actual);
    }

    @Test
    public void sub_pass_test() {
        Subtract a = new Subtract();
        int actual = a.sub(160, 40);
        Assert.assertEquals(160 - 40, actual);
    }

    @Test
    public void mul_pass_test() {
        Multiply a = new Multiply();
        int actual = a.multiply(20, 10);
        Assert.assertEquals(20 * 10, actual);
    }

    @Test
    public void div_pass_test() {
        Divide a = new Divide();
        int expectedValue = 10;
        int actual = (int) a.divide(100, 10);
        Assert.assertEquals(100 / 10, actual);
    }
}
