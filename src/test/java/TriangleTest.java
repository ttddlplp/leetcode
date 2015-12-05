import com.google.common.collect.ImmutableList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class TriangleTest {

    @Test
    public void test1() throws Exception {
        Triangle triangle = new Triangle();
        int total = triangle.minimumTotal(ImmutableList.of(ImmutableList.of(1), ImmutableList.of(2, 3)));
        assertEquals(3, total);

    }

    @Test
    public void test2() throws Exception {
        Triangle triangle = new Triangle();
        int total = triangle.minimumTotal(ImmutableList.of(ImmutableList.of(-1), ImmutableList.of(2, 3), ImmutableList.of(1, -1, -3)));
        assertEquals(-1, total);

    }

    @Test
    public void test3() throws Exception {
        Triangle triangle = new Triangle();
        int total = triangle.minimumTotal(ImmutableList.of(ImmutableList.of(-1), ImmutableList.of(3, 2), ImmutableList.of(1, -2, -1)));
        assertEquals(-1, total);

    }

    @Test
    public void test4() throws Exception {
        Triangle triangle = new Triangle();
        int total = triangle.minimumTotal(ImmutableList.of(ImmutableList.of(-1), ImmutableList.of(3, 2), ImmutableList.of(-3, 1, -1)));
        assertEquals(-1, total);

    }
}