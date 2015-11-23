import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/11/23.
 */
public class ThreeSumClosestTest {
    @Test
    public void testName() throws Exception {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        int result = threeSumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        assertEquals(2, result);
    }
}