import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by gaoxiangzeng-personal on 15/11/25.
 */
public class SubSetTest {

    private SubSet subSet;

    @Before
    public void setUp() throws Exception {
        subSet = new SubSet();
    }

    @Test
    public void testname() throws Exception {
        List<List<Integer>> subsets = subSet.subsets(new int[]{1, 2, 3});
        System.out.println(subsets);

    }
}