import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class SimplifyPathTest {
    @Test
    public void test1() throws Exception {
        SimplifyPath simplifyPath = new SimplifyPath();
        String path = simplifyPath.simplifyPath("/a/./b/../../c/");
        assertEquals("/c", path);
    }

    @Test
    public void test2() throws Exception {
        SimplifyPath simplifyPath = new SimplifyPath();
        String path = simplifyPath.simplifyPath("/home/");
        assertEquals("/home", path);
    }

    @Test
    public void test3() throws Exception {
        SimplifyPath simplifyPath = new SimplifyPath();
        String path = simplifyPath.simplifyPath("/..");
        assertEquals("/", path);
    }
}