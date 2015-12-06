package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class PerfectSquareTest {
    @Test
    public void testName() throws Exception {
        PerfectSquare perfectSquare = new PerfectSquare();
        assertEquals(3, perfectSquare.numSquares(12));
        assertEquals(2, perfectSquare.numSquares(13));
        assertEquals(1, perfectSquare.numSquares(0));
        assertEquals(0, perfectSquare.numSquares(-1));
    }
}