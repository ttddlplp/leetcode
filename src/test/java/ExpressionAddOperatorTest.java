import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ExpressionAddOperatorTest {

    private ExpressionAddOperator expressionAddOperator;

    @Before
    public void setUp() throws Exception {
        expressionAddOperator = new ExpressionAddOperator();
    }

    @Test
    public void test1() throws Exception {
        assertEquals(Arrays.asList("1+2+3", "1*2*3"), expressionAddOperator.addOperators("123", 6));
    }
    
    @Test
    public void test2() throws Exception {
        assertEquals(Arrays.asList("2+3*2", "2*3+2"), expressionAddOperator.addOperators("232", 8));
    }
    
    @Test
    public void test3() throws Exception {
        assertEquals(Arrays.asList("1*0+5", "10-5"), expressionAddOperator.addOperators("105", 5));
    }
    
    @Test
    public void test4() throws Exception {
        assertEquals(Arrays.asList("0+0", "0-0", "0*0"), expressionAddOperator.addOperators("00", 0));
    }
    
    @Test
    public void testNull() throws Exception {
        assertEquals(Arrays.asList(), expressionAddOperator.addOperators(null, 0));
    }
    
    @Test
    public void test5() throws Exception {
        assertEquals(Arrays.asList(), expressionAddOperator.addOperators("3456237490", 9191));
    }
}
