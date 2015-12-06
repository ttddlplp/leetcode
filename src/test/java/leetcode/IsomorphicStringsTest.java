package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class IsomorphicStringsTest {

    private IsomorphicStrings isomorphicStrings;

    @Before
    public void setUp() throws Exception {
        isomorphicStrings = new IsomorphicStrings();
    }

    @Test
    public void test1() throws Exception {
        assertTrue(isomorphicStrings.isIsomorphic("egg", "add"));
    }

    @Test
    public void test2() throws Exception {
        assertFalse(isomorphicStrings.isIsomorphic("foo", "bar"));
    }
}