package leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/9.
 */
public class MergeIntervalTest {

    private MergeInterval mergeInterval;

    @Before
    public void setUp() throws Exception {
        mergeInterval = new MergeInterval();
    }

    @Test
    public void test1() throws Exception {
        List<Interval> merge = mergeInterval.merge(Arrays.asList(new Interval(1, 2), new Interval(1, 8), new Interval(9, 11)));
        assertEquals(Arrays.asList(new Interval(1, 8), new Interval(9, 11)), merge);
    }
}