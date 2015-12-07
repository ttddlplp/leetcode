package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/7.
 */
public class RangeSumQuery2DImmutableTest {
    @Test
    public void test1() throws Exception {
        int[][] testArray = new int[][]{{1,1},{1,1}};
        RangeSumQuery2DImmutable rangeSumQuery2DImmutable = new RangeSumQuery2DImmutable(testArray);
        assertEquals(4, rangeSumQuery2DImmutable.sumRegion(0,0,1,1));
    }

    @Test
    public void test2() throws Exception {
        int[][] testArray = new int[][]{{1,1,1},{1,1,1},{1,1,1}};
        RangeSumQuery2DImmutable rangeSumQuery2DImmutable = new RangeSumQuery2DImmutable(testArray);
        assertEquals(4, rangeSumQuery2DImmutable.sumRegion(1,1,2,2));
    }

    @Test
    public void test3() throws Exception {
        int[][] testArray = new int[][]{{1,1,1},{1,1,1}};
        RangeSumQuery2DImmutable rangeSumQuery2DImmutable = new RangeSumQuery2DImmutable(testArray);
        assertEquals(2, rangeSumQuery2DImmutable.sumRegion(1,1,1,2));
    }

    @Test
    public void test4() throws Exception {
        int[][] testArray = new int[][]{{1,1,1}};
        RangeSumQuery2DImmutable rangeSumQuery2DImmutable = new RangeSumQuery2DImmutable(testArray);
        assertEquals(1, rangeSumQuery2DImmutable.sumRegion(0,1,0,1));
    }
}