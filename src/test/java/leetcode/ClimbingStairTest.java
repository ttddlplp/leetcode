package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbingStairTest {

    private ClimbingStair climbingStair;

    @Before
    public void setUp() throws Exception {
        climbingStair = new ClimbingStair();
    }

    @Test
    public void test1() throws Exception {
        assertEquals(1, climbingStair.climbStairs(1));
    }
    
    @Test
    public void test2() throws Exception {
        assertEquals(2, climbingStair.climbStairs(2));
    }
    
    @Test
    public void test3() throws Exception {
        assertEquals(3, climbingStair.climbStairs(3));
    }
}
