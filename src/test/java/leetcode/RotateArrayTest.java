package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/12.
 */
public class RotateArrayTest {

    private RotateArray rotateArray;

    @Before
    public void setUp() throws Exception {
        rotateArray = new RotateArray();
    }

    @Test
    public void test1() throws Exception {
        int[] testArray = new int[]{1,2,3,4,5,6,7};
        rotateArray.rotate(testArray, 3);
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, testArray);
    }

    @Test
    public void testLargeThanLength() throws Exception {
        int[] testArray = new int[]{1,2,3,4,5,6,7};
        rotateArray.rotate(testArray, 10);
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, testArray);
    }

    @Test
    public void test3() throws Exception {
        int[] testArray = new int[]{1,2};
        rotateArray.rotate(testArray, 1);
        assertArrayEquals(new int[]{2, 1}, testArray);
    }
}