package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by gaoxiangzeng-personal on 15/12/10.
 */
public class ScrambleStringTest {

    private ScrambleString scrambleString;

    @Before
    public void setUp() throws Exception {
        scrambleString = new ScrambleString();
    }

    @Test
    public void test1() throws Exception {
        assertTrue(scrambleString.isScramble("great", "rgtae"));

    }
}