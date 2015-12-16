package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/10.
 */
public class BurstBallonsTest {

    private BurstBallons burstBallons;

    @Before
    public void setUp() throws Exception {
        burstBallons = new BurstBallons();
    }

    @Test
    public void test1() throws Exception {
        int result = burstBallons.maxCoins(new int[]{3, 1, 5, 8});
        assertEquals(167, result);
    }
}