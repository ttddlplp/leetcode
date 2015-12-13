package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/13.
 */
public class MaximumProductSubarrayTest {

    private MaximumProductSubarray maximumProductSubarray;

    @Before
    public void setUp() throws Exception {
        maximumProductSubarray = new MaximumProductSubarray();
    }

    @Test
    public void test1() throws Exception {
        int result = maximumProductSubarray.maxProduct(new int[]{2, 3, -2, 4});
        assertEquals(6, result);
    }
}