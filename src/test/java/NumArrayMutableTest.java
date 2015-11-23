import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class NumArrayMutableTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void test() {
        int[] test = new int[] {2, 3, 5, 7, 8};
        NumArrayMutable numArrayMutable = new NumArrayMutable(test);

        assertEquals(20, numArrayMutable.sumRange(2, 4));

        numArrayMutable.update(2, 6);
        assertEquals(21, numArrayMutable.sumRange(2, 4));
    }

    @Test
    public void testNull() throws Exception {
        int[] test = new int[]{};
        NumArrayMutable numArrayMutable = new NumArrayMutable(test);

    }

    @Test
    public void testWrong1() throws Exception {
        int[] test = new int[] {1, 3, 5};
        NumArrayMutable numArrayMutable = new NumArrayMutable(test);

        assertEquals(9, numArrayMutable.sumRange(0, 2));

        numArrayMutable.update(1, 2);
        assertEquals(8, numArrayMutable.sumRange(0, 2));

    }
}