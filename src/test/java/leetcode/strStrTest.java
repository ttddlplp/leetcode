package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/1.
 */
public class strStrTest {

    private StrStr strStr;

    @Before
    public void setUp() throws Exception {
        strStr = new StrStr();
    }

    @Test
    public void testName() throws Exception {
        assertEquals(2, strStr.strStr("abcdefg", "cde"));

    }
}