package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class CompareVersionTest {
    @Test
    public void testName() throws Exception {
        CompareVersion compareVersion = new CompareVersion();
        assertEquals(1, compareVersion.compareVersion("1.1", "0.1"));
    }
}