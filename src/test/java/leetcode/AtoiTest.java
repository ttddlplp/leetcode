package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/14.
 */
public class AtoiTest {

    private Atoi atoi;

    @Before
    public void setUp() throws Exception {
        atoi = new Atoi();
    }

    @Test
    public void test1() throws Exception {
        assertEquals(45, atoi.myAtoi("45"));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(-45, atoi.myAtoi("-45"));
    }

    @Test
    public void test3() throws Exception {
        assertEquals(45, atoi.myAtoi("000045"));
    }

    @Test
    public void test4() throws Exception {
        assertEquals(Integer.MAX_VALUE, atoi.myAtoi(String.valueOf(Integer.MAX_VALUE)));
    }

    @Test
    public void test5() throws Exception {
        assertEquals(Integer.MIN_VALUE, atoi.myAtoi(String.valueOf(Integer.MIN_VALUE)));
    }

    @Test
    public void test6() throws Exception {
        assertEquals(-12, atoi.myAtoi("  -0012a42"));
    }

    @Test
    public void test7() throws Exception {
        assertEquals(2147483647, atoi.myAtoi("2147483648"));
    }

    @Test
    public void test8() throws Exception {
        assertEquals(-2147483648, atoi.myAtoi("      -11919730356x"));
    }
}