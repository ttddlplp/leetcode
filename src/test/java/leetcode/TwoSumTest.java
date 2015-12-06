package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void setUp() throws Exception {
        twoSum = new TwoSum();
    }

    @Test
    public void testNormal() throws Exception {
        int[] array = new int[] {1, 3, 5, 9};
        int[] expected = new int[] {2, 3};
        int[] result = twoSum.twoSum(array, 8);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSame() throws Exception {
        int[] array = new int[] {2, 5, 5, 9};
        int[] expected = new int[] {2, 3};
        int[] result = twoSum.twoSum(array, 10);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testNull() throws Exception {
        int[] array = null;
        int[] expected = null;
        int[] result = twoSum.twoSum(array, 10);
        assertArrayEquals(expected, result);

    }

    @Test
    public void testNotFound() throws Exception {
        int[] array = new int[] {2, 5, 3, 9};
        int[] expected = null;
        int[] result = twoSum.twoSum(array, 10);
        assertArrayEquals(expected, result);
    }
}