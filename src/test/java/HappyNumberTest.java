import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class HappyNumberTest {

    private HappyNumber happyNumber;

    @Before
    public void setUp() throws Exception {
        happyNumber = new HappyNumber();
    }

    @Test
    public void test1() throws Exception {
        assertTrue(happyNumber.isHappy(19));
    }

    @Test
    public void test2() throws Exception {
        assertTrue(happyNumber.isHappy(100));
    }
}