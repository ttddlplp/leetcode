package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class LongSubWithNoRepeatTest {
    @Test
    public void testNormal() throws Exception {
        LongSubWithNoRepeat l = new LongSubWithNoRepeat();
        assertEquals(3, l.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testOneLength() throws Exception {
        LongSubWithNoRepeat l = new LongSubWithNoRepeat();
        assertEquals(1, l.lengthOfLongestSubstring("aaaaa"));
    }

    @Test
    public void testLongestAtLast() throws Exception {
        LongSubWithNoRepeat l = new LongSubWithNoRepeat();
        assertEquals(6, l.lengthOfLongestSubstring("abcabcaaefghi"));
    }

    @Test
    public void testWrong() throws Exception {
        LongSubWithNoRepeat l = new LongSubWithNoRepeat();
        assertEquals(2, l.lengthOfLongestSubstring("abba"));
    }
}