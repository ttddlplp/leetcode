import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximalSquareTest {

    private MaximalSquare maximalSquare;

    @Before
    public void setUp() throws Exception {
        maximalSquare = new MaximalSquare();
    }

    @Test
    public void testNull() throws Exception {
        assertEquals(0, maximalSquare.maximalSquare(null));
    }

    @Test
    public void testOneLine() throws Exception {
        assertEquals(1, maximalSquare.maximalSquare(new char[][]{{'0','1','1'}}));
    }
    
    @Test
    public void test1() throws Exception {
        assertEquals(4, maximalSquare.maximalSquare(new char[][]{{'1','1'}, {'1', '1'}}));
    }
    
    @Test
    public void test2() throws Exception {
        assertEquals(4, maximalSquare.maximalSquare(new char[][]{{'1','1','0'}, {'1', '1','0'}}));
    }

    @Test
    public void test3() throws Exception {
        assertEquals(4, maximalSquare.maximalSquare(new char[][]{{'1','1','0'}, {'1', '1','0'}}));
    }
    
    @Test
    public void test4() throws Exception {
        assertEquals(4, maximalSquare.maximalSquare(new char[][]{{'1','0','1','0','0'},
                                                                {'1','0','1','1','1'},
                                                                {'1','1','1','1','1'},
                                                                {'1','0','0','1','0'},}));
    }
    
    
    @Test
    public void test5() throws Exception {
        assertEquals(9, maximalSquare.maximalSquare(new char[][]{{'1','1','1','1','0'},
                                                                {'0','1','1','1','1'},
                                                                {'1','1','1','1','1'},
                                                                {'1','0','0','1','0'},}));
    }
}
