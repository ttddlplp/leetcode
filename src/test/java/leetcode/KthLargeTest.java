package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class KthLargeTest {

    private KthLarge kthLarge;

    @Before
    public void setUp() throws Exception {
        kthLarge = new KthLarge();
    }

    @Test
    public void test1() throws Exception {
        int kthLargest = kthLarge.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        assertEquals(5, kthLargest);
    }

    @Test
    public void test2() throws Exception {
        int kthLargest = kthLarge.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 1);
        assertEquals(6, kthLargest);
    }
}