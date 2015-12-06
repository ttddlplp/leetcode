package leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class SingleNumberIIITest {
    @Test
    public void testName() throws Exception {
        SingleNumberIII singleNumberIII = new SingleNumberIII();
        System.out.println(Arrays.toString(singleNumberIII.singleNumber(new int[]{1, 2, 1, 3, 2, 5})));

    }
}