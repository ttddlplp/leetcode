package leetcode;

import com.google.common.collect.Sets;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordLadderTest {

    @Test
    public void testName() throws Exception {
        WordLadder wordLadder = new WordLadder();
        int result = wordLadder.ladderLength("hit", "cog", Sets.newHashSet("hot", "dot", "dog", "lot", "log"));
        assertEquals(5, result);
    }
}
