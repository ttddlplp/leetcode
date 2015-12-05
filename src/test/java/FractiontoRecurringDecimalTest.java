import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class FractiontoRecurringDecimalTest {

    private FractiontoRecurringDecimal fractiontoRecurringDecimal;

    @Before
    public void setUp() throws Exception {
        fractiontoRecurringDecimal = new FractiontoRecurringDecimal();
    }

    @Test
    public void test1() throws Exception {
        assertEquals("0.5", fractiontoRecurringDecimal.fractionToDecimal(5, 10));
    }

    @Test
    public void test2() throws Exception {
        assertEquals("2", fractiontoRecurringDecimal.fractionToDecimal(2, 1));
    }

    @Test
    public void test3() throws Exception {
        assertEquals("0.(6)", fractiontoRecurringDecimal.fractionToDecimal(2, 3));
    }

    @Test
    public void test4() throws Exception {
        assertEquals("-0.(6)", fractiontoRecurringDecimal.fractionToDecimal(2, -3));
    }

    @Test
    public void test5() throws Exception {
        assertEquals("0.(01)", fractiontoRecurringDecimal.fractionToDecimal(1, 99));
    }

    @Test
    public void test6() throws Exception {
        assertEquals(String.valueOf(Integer.MAX_VALUE), fractiontoRecurringDecimal.fractionToDecimal(Integer.MAX_VALUE, 1));
    }

    @Test
    public void test7() throws Exception {
        assertEquals("0.1(6)", fractiontoRecurringDecimal.fractionToDecimal(1, 6));
    }

    @Test
    public void test8() throws Exception {
        assertEquals("0.0000000004656612873077392578125", fractiontoRecurringDecimal.fractionToDecimal(-1, Integer.MIN_VALUE));
    }
}