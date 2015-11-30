import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @Before
    public void setUp() throws Exception {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void testEmpty() throws Exception {
        assertTrue(validParentheses.isValid(""));
    }

    @Test
    public void test1() throws Exception {
        assertTrue(validParentheses.isValid("{}[]()"));
    }

    @Test
    public void test2() throws Exception {
        assertTrue(validParentheses.isValid("{[()]}"));
    }
    
    @Test
    public void test3() throws Exception {
        assertFalse(validParentheses.isValid("{[}()]}"));
    }
    
    @Test
    public void test4() throws Exception {
        assertFalse(validParentheses.isValid("{[}]"));
    }
    
    @Test
    public void test5() throws Exception {
        assertFalse(validParentheses.isValid("{{{{{{"));
    }
    
    @Test
    public void test6() throws Exception {
        assertFalse(validParentheses.isValid("{{]]"));
    }
    
    @Test
    public void test7() throws Exception {
        assertFalse(validParentheses.isValid("]]"));
    }
}
