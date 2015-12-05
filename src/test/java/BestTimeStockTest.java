import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class BestTimeStockTest {

    private BestTimeStock bestTimeStock;

    @Before
    public void setUp() throws Exception {
        bestTimeStock = new BestTimeStock();
    }

    @Test
    public void test1() throws Exception {
        int profit = bestTimeStock.maxProfit(new int[]{2, 1});
        assertEquals(0, profit);
    }

    @Test
    public void test2() throws Exception {
        int profit = bestTimeStock.maxProfit(new int[]{1, 2, 3});
        assertEquals(2, profit);
    }

    @Test
    public void test3() throws Exception {
        int profit = bestTimeStock.maxProfit(new int[]{5, 1, 6, 3});
        assertEquals(5, profit);
    }
}