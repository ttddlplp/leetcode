import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class DistinctSubsequencesTest {

    private DistinctSubsequences distinctSubsequences;

    @Before
    public void setUp() throws Exception {
        distinctSubsequences = new DistinctSubsequences();
    }

    @Test
    public void test1() throws Exception {
        int result = distinctSubsequences.numDistinct("a", "b");
        assertEquals(0, result);
    }
}