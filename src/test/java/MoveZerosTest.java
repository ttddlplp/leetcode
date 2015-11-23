import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class MoveZerosTest {
    @Test
    public void test1() throws Exception {
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = {1, 0, 2, 3, 0, 5};
        int[] expected = {1, 2, 3, 5, 0, 0};
        moveZeros.moveZeroes(nums);

        assertArrayEquals(nums, expected);
    }

    @Test
    public void testNull() throws Exception {
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = null;
        int[] expected = null;
        moveZeros.moveZeroes(nums);
        assertArrayEquals(nums, expected);
    }

    @Test
    public void testAllZeros() throws Exception {
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = {0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0};
        moveZeros.moveZeroes(nums);
        assertArrayEquals(nums, expected);
    }
    @Test
    public void testNoZero() throws Exception {
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = {1, 2, 5, 8, 9};
        int[] expected = {1, 2, 5, 8, 9};
        moveZeros.moveZeroes(nums);
        assertArrayEquals(nums, expected);
    }

    @Test
    public void testEdgeNumber() throws Exception {
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = {Integer.MAX_VALUE, 2, 0, 8, Integer.MIN_VALUE};
        int[] expected = {Integer.MAX_VALUE, 2, 8, Integer.MIN_VALUE, 0};
        moveZeros.moveZeroes(nums);
        assertArrayEquals(nums, expected);
    }
}