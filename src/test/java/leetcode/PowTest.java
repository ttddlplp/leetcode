package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowTest {

    private Pow pow;

    @Before
    public void setUp() throws Exception {
        pow = new Pow();
    }

    @Test
    public void test1() throws Exception {
        double v = pow.myPow(8.88023, 3);
        assertEquals(700.28148, v, 0.0001);
    }
}
