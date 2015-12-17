package leetcode;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WordLadderIITest {

    @Test
    public void testName() throws Exception {
        WordLadderII wordLadder = new WordLadderII();
        List<List<String>> result = wordLadder.findLadders("hit", "cog", Sets.newHashSet("hot", "dot", "dog", "lot", "log"));
        System.out.println(result);
        assertEquals(2, result.size());
        assertTrue(result.stream().anyMatch(list -> list.equals(Arrays.asList("hit","hot","dot","dog","cog"))));
        assertTrue(result.stream().anyMatch(list -> list.equals(Arrays.asList("hit", "hot", "lot", "log", "cog"))));
    }

    @Test
    public void test2() throws Exception {
        WordLadderII wordLadder = new WordLadderII();
        List<List<String>> result = wordLadder.findLadders("hot", "dog", Sets.newHashSet("hot", "dot", "dog"));
        System.out.println(result);
        assertEquals(2, result.size());
        assertTrue(result.stream().anyMatch(list -> list.equals(Arrays.asList("hit","hot","dot","dog","cog"))));
        assertTrue(result.stream().anyMatch(list -> list.equals(Arrays.asList("hit", "hot", "lot", "log", "cog"))));
    }
}
