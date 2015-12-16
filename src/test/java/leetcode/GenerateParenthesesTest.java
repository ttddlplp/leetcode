package leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/12.
 */
public class GenerateParenthesesTest {

    private GenerateParentheses generateParentheses;

    @Before
    public void setUp() throws Exception {
        generateParentheses = new GenerateParentheses();
    }

    @Test
    public void test1() throws Exception {
        List<String> result = generateParentheses.generateParenthesis(3);
        assertEquals(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"), result);
    }
}