package JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class SinDoubleTest extends BaseCalcTest {

    private double arg1;

    private double expected;

    @Test
    public void testDoubleSin() {
        double result = calculator.sin(arg1);
        expected=Math.sin(arg1);
        Assert.assertEquals(expected, result, 0);
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {2},
                {0},
                {-3.14}
        });
    }
}
