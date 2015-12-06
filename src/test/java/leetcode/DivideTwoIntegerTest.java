package leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/1.
 */
public class DivideTwoIntegerTest {

    private DivideTwoInteger divideTwoInteger;

    @Before
    public void setUp() throws Exception {
        divideTwoInteger = new DivideTwoInteger();
    }

    @Test
    public void testName() throws Exception {
        for (int i = 0; i < 100; i++) {
            int dividend = new Random().nextInt(100) * (new Random().nextBoolean() ? 1 : -1);
            int divisor = new Random().nextInt(100) * (new Random().nextBoolean() ? 1 : -1);
            if (divisor == 0) {
                continue;
            }
            assertEquals("dividend: " + dividend + ", divisor: " + divisor, dividend / divisor, divideTwoInteger.divide(dividend, divisor));
        }

    }
}