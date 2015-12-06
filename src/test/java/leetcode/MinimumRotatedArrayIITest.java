package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/3.
 */
public class MinimumRotatedArrayIITest {

    private MinimumRotatedArrayII minimumRotatedArray;

    @Before
    public void setUp() throws Exception {
        minimumRotatedArray = new MinimumRotatedArrayII();
    }

    @Test
    public void testName() throws Exception {
        assertEquals(1, minimumRotatedArray.findMin(new int[]{1,2,3}));
    }

    @Test
    public void test1() throws Exception {
        assertEquals(1, minimumRotatedArray.findMin(new int[]{1}));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(1, minimumRotatedArray.findMin(new int[]{3, 1}));
    }


    @Test
    public void testName2() throws Exception {
        assertEquals(1, minimumRotatedArray.findMin(new int[]{2,3,1}));
    }

    @Test
    public void testName3() throws Exception {
        assertEquals(1, minimumRotatedArray.findMin(new int[]{3,4,6,8,10,1,2}));
    }

    @Test
    public void testName4() throws Exception {
        assertEquals(2, minimumRotatedArray.findMin(new int[]{3,4,6,8,10,2}));
    }

    @Test(expected = RuntimeException.class)
    public void testEmpty() throws Exception {
        minimumRotatedArray.findMin(new int[]{});
    }

    @Test
    public void testMin() throws Exception {
        assertEquals(Integer.MIN_VALUE, minimumRotatedArray.findMin(new int[]{Integer.MIN_VALUE+5, Integer.MIN_VALUE+6, Integer.MIN_VALUE}));
    }

    @Test
    public void testMax() throws Exception {
        assertEquals(Integer.MAX_VALUE - 5, minimumRotatedArray.findMin(new int[]{Integer.MAX_VALUE-5, Integer.MAX_VALUE-4, Integer.MAX_VALUE}));
    }

    @Test
    public void testCombineMaxMin() throws Exception {
        assertEquals(Integer.MIN_VALUE, minimumRotatedArray.findMin(new int[]{Integer.MAX_VALUE-5, Integer.MAX_VALUE-4, Integer.MIN_VALUE}));
    }
}