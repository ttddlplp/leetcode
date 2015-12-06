package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class FindDuplicateTest {
    @Test
    public void testName() throws Exception {
        FindDuplicate findDuplicate = new FindDuplicate();
        int[] array = {1,2,3,4,3};
        assertEquals(3, findDuplicate.findDuplicate(array));

    }
}