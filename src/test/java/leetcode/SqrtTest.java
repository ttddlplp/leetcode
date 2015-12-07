package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/7.
 */
public class SqrtTest {
    @Test
    public void test1() throws Exception {
        Sqrt sqrt = new Sqrt();
        assertEquals(2, sqrt.mySqrt(4));
    }

    @Test
    public void test2() throws Exception {
        Sqrt sqrt = new Sqrt();
        assertEquals(9, sqrt.mySqrt(81));
    }

    @Test
    public void test3() throws Exception {
        Sqrt sqrt = new Sqrt();
        assertEquals(0, sqrt.mySqrt(0));
    }

    @Test
    public void test4() throws Exception {
        Sqrt sqrt = new Sqrt();
        assertEquals(1, sqrt.mySqrt(3));
    }
    @Test
    public void test5() throws Exception {
        Sqrt sqrt = new Sqrt();
        assertEquals(46340, sqrt.mySqrt(Integer.MAX_VALUE));
    }

    @Test
    public void test7() throws Exception {
        Sqrt sqrt = new Sqrt();
        assertEquals(13553, sqrt.mySqrt(183692038));
    }
}