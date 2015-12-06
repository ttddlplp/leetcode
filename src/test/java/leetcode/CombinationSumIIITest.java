package leetcode;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by gaoxiangzeng-personal on 15/11/29.
 */
public class CombinationSumIIITest {

    private CombinationSumIII combinationSumIII;

    @Before
    public void setUp() throws Exception {
        combinationSumIII = new CombinationSumIII();
    }

    @Test
    public void testName() throws Exception {
        System.out.println(combinationSumIII.combinationSum3(2, 6));

    }
}