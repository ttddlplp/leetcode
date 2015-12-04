import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/4.
 */
public class CourseScheduleIITest {

    private CourseScheduleII courseScheduleII;

    @Before
    public void setUp() throws Exception {
        courseScheduleII = new CourseScheduleII();
    }

    @Test
    public void test1() throws Exception {
        int[] order = courseScheduleII.findOrder(2, new int[][]{{1, 0}});
        System.out.println(Arrays.toString(order));
        assertArrayEquals(new int[]{0, 1}, order);
    }

    @Test
    public void test2() throws Exception {
        int[] order = courseScheduleII.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}});
        System.out.println(Arrays.toString(order));
        assertArrayEquals(new int[]{0, 2, 1, 3}, order);
    }

    @Test
    public void test3() throws Exception {
        int[] order = courseScheduleII.findOrder(2, new int[][]{});
        System.out.println(Arrays.toString(order));
        assertArrayEquals(new int[]{1, 0}, order);
    }

    @Test
    public void test4() throws Exception {
        int[] order = courseScheduleII.findOrder(1, new int[][]{});
        System.out.println(Arrays.toString(order));
        assertArrayEquals(new int[]{0}, order);
    }

    @Test
    public void test5() throws Exception {
        int[] order = courseScheduleII.findOrder(2, new int[][]{{1,0},{0,1}});
        System.out.println(Arrays.toString(order));
        assertArrayEquals(new int[]{}, order);
    }
}