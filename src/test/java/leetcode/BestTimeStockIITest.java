package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class BestTimeStockIITest {

    private BestTimeStockII bestTimeStockII;

    @Before
    public void setUp() throws Exception {
        bestTimeStockII = new BestTimeStockII();
    }

    @Test
    public void test1() throws Exception {
        int profit = bestTimeStockII.maxProfit(new int[]{2, 1, 1});
        assertEquals(0, profit);
    }

    @Test
    public void test2() throws Exception {
        int profit = bestTimeStockII.maxProfit(new int[]{2, 1, 2});
        assertEquals(1, profit);
    }

    @Test
    public void test3() throws Exception {
        int profit = bestTimeStockII.maxProfit(new int[]{2, 1, 2, 1, 5, 3});
        assertEquals(5, profit);
    }

    @Test
    public void test4() throws Exception {
        int profit = bestTimeStockII.maxProfit(new int[]{2, 4, 1});
        assertEquals(2, profit);
    }
}