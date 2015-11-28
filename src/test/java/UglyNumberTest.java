import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by gaoxiangzeng-personal on 15/11/28.
 */
public class UglyNumberTest {

    private UglyNumber uglyNumber;

    @Before
    public void setUp() throws Exception {
        uglyNumber = new UglyNumber();
    }

    @Test
    public void testOne() throws Exception {
        assertTrue(uglyNumber.isUgly(1));
    }

    @Test
    public void testName() throws Exception {
        assertFalse(uglyNumber.isUgly(14));
    }
}