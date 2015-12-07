package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/7.
 */
public class BestTimeStockCooldownTest {

    private BestTimeStockCooldown bestTimeStockCooldown;

    @Before
    public void setUp() throws Exception {
        bestTimeStockCooldown = new BestTimeStockCooldown();
    }

    @Test
    public void test1() throws Exception {
        int maxProfit = bestTimeStockCooldown.maxProfit(new int[]{1, 2, 3, 0, 2});
        assertEquals(3, maxProfit);
    }
}