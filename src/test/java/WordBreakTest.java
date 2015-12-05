import com.google.common.collect.ImmutableSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class WordBreakTest {

    private WordBreak wordBreak;

    @Before
    public void setUp() throws Exception {
        wordBreak = new WordBreak();
    }

    @Test
    public void testName() throws Exception {
        assertTrue(wordBreak.wordBreak("leetcode", ImmutableSet.of("leet", "code")));
    }

    @Test
    public void testName2() throws Exception {
        assertFalse(wordBreak.wordBreak("a", ImmutableSet.of()));
    }
}