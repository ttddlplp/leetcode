import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/11/23.
 */
public class RectangleAreaTest {
    @Test
    public void testName() throws Exception {
        RectangleArea rectangleArea = new RectangleArea();
        int area = rectangleArea.computeArea(-3, 0, 3, 4, 0, -1, 9, 2);
        assertEquals(45, area);

    }

    @Test
    public void testName2() throws Exception {
        RectangleArea rectangleArea = new RectangleArea();
        int area = rectangleArea.computeArea(0 ,0 , 0, 0, -1, -1, 1, 1);
        assertEquals(4, area);

    }

    @Test
    public void testName3() throws Exception {
        RectangleArea rectangleArea = new RectangleArea();
        int area = rectangleArea.computeArea(-2 ,-2 , 2, 2, 3, 3, 4, 4);
        assertEquals(17, area);

    }

    @Test
    public void testName4() throws Exception {
        RectangleArea rectangleArea = new RectangleArea();
        int area = rectangleArea.computeArea(-1500000001, 0, -1500000000, 1, 1500000000, 0, 1500000001, 1);
        assertEquals(2, area);

    }
}