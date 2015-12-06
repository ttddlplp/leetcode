package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximalSubarrayTest {

    private MaximalSubarray maximalSubarray;

    @Before
    public void setUp() throws Exception {
        maximalSubarray = new MaximalSubarray();
    }

    @Test
    public void testName() throws Exception {
        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, maximalSubarray.maxSubArray(array));
    }
}
