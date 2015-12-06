package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class RemoveElementTest {

    private RemoveElement removeElement;

    @Before
    public void setUp() throws Exception {
        removeElement = new RemoveElement();
    }

    @Test
    public void test1() throws Exception {
        int result = removeElement.removeElement(new int[]{1, 2, 3, 5, 2, 3, 6}, 2);
        assertEquals(5, result);
    }

    @Test
    public void test2() throws Exception {
        int result = removeElement.removeElement(new int[]{1, 2, 3, 5, 1, 3, 6}, 2);
        assertEquals(6, result);
    }

    @Test
    public void test3() throws Exception {
        int result = removeElement.removeElement(new int[]{1}, 1);
        assertEquals(0, result);
    }
}