import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class AddBinaryTest {

    private AddBinary addBinary;

    @Before
    public void setUp() throws Exception {
        addBinary = new AddBinary();
    }

    @Test
    public void test1() throws Exception {
        assertEquals("100", addBinary.addBinary("11", "1"));
    }
}