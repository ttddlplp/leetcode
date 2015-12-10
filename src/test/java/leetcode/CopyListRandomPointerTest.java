package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/10.
 */
public class CopyListRandomPointerTest {

    private CopyListRandomPointer copyListRandomPointer;

    @Before
    public void setUp() throws Exception {
        copyListRandomPointer = new CopyListRandomPointer();
    }

    @Test
    public void test1() throws Exception {
        RandomListNode expected = new RandomListNode.Builder(5, 6).with(3, null).with(6, null).build();

        RandomListNode actual = copyListRandomPointer.copyRandomList2(expected);
        assertEquals(actual, expected);
    }
}