package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class MedianTwoSortedArrayTest {

    private MedianTwoSortedArray m;

    @Before
    public void setUp() throws Exception {
        m = new MedianTwoSortedArray();
    }

    @Test
    public void testName() throws Exception {
        int[] nums1 = new int[] {1, 3, 5};
        int[] nums2 = new int[] {2, 4, 6};
        assertEquals(3, m.findKthElements(3, nums1, nums2));
    }
    @Test
    public void testName2() throws Exception {
        int[] nums1 = new int[] {1, 3, 5};
        int[] nums2 = new int[] {2, 4, 6};
        assertEquals(2, m.findKthElements(2, nums1, nums2));
    }

    @Test
    public void testName3() throws Exception {
        int[] nums1 = new int[] {1, 3, 5};
        int[] nums2 = new int[] {2, 4, 6};
        assertEquals(6, m.findKthElements(6, nums1, nums2));
    }
}