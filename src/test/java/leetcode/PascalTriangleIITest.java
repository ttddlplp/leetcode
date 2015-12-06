package leetcode;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/11/29.
 */
public class PascalTriangleIITest {

    private PascalTriangleII pascalTriangleII;

    @Before
    public void setUp() throws Exception {
        pascalTriangleII = new PascalTriangleII();
    }

    @Test
    public void testName() throws Exception {
        assertEquals(Lists.newArrayList(1, 3, 3, 1), pascalTriangleII.getRow(3));
    }
}