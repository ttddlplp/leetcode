package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class ReverseIntegerTest {
    @Test
    public void testName() throws Exception {
        ReverseInteger r = new ReverseInteger();
        assertEquals(-123, r.reverse(-321));
        assertEquals(0, r.reverse(0));
        assertEquals(543, r.reverse(345));

    }
}