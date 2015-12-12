package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/12.
 */
public class SlidingWindowMaxTest {

    private SlidingWindowMax slidingWindowMax;

    @Before
    public void setUp() throws Exception {
        slidingWindowMax = new SlidingWindowMax();
    }

    @Test
    public void test1() throws Exception {
        int[] result = slidingWindowMax.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        assertArrayEquals(new int[]{3,3,5,5,6,7}, result);
    }

    @Test
    public void test2() throws Exception {
        int[] result = slidingWindowMax.maxSlidingWindow(new int[]{9,10,9,-7,-4,-8,2,-6}, 5);
        assertArrayEquals(new int[]{10, 10, 9, 2}, result);
    }
}