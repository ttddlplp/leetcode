package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromePartitioningTest {

    private PalindromePartitioning palindromePartitioning;

    @Before
    public void setUp() throws Exception {
        palindromePartitioning = new PalindromePartitioning();
    }

    @Test
    public void testEmpty() throws Exception {
        assertTrue(palindromePartitioning.partition("").isEmpty());
    }
    
    @Test
    public void test1() throws Exception {
        System.out.println(palindromePartitioning.partition("aab"));
    }
}
