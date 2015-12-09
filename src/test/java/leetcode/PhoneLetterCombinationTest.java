package leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/9.
 */
public class PhoneLetterCombinationTest {

    private PhoneLetterCombination phoneLetterCombination;

    @Before
    public void setUp() throws Exception {
        phoneLetterCombination = new PhoneLetterCombination();
    }

    @Test
    public void test1() throws Exception {
        List<String> result = phoneLetterCombination.letterCombinations("23");
        Collections.sort(result);
        assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), result);
    }
}