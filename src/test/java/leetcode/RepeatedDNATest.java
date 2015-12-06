package leetcode;

import com.google.common.collect.ImmutableSet;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by gaoxiangzeng-personal on 15/11/28.
 */
public class RepeatedDNATest {

    private RepeatedDNA repeatedDNA;

    @Before
    public void setUp() throws Exception {
        repeatedDNA = new RepeatedDNA();
    }

    @Test
    public void testName() throws Exception {
        final Set<String> expected = new ImmutableSet.Builder<String>().add("AAAAACCCCC", "CCCCCAAAAA").build();
        List<String> actual = repeatedDNA.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        assertEquals(expected.size(), actual.size());
        assertTrue(actual.stream().allMatch(s -> expected.contains(s)));
    }

    @Test
    public void testFailed1() throws Exception {
        final Set<String> expected = new ImmutableSet.Builder<String>().add("AAAAAAAAAA").build();
        List<String> actual = repeatedDNA.findRepeatedDnaSequences("AAAAAAAAAAA");
        assertEquals(expected.size(), actual.size());
        assertTrue(actual.stream().allMatch(s -> expected.contains(s)));
    }

    @Test
    public void testFailed2() throws Exception {
        final Set<String> expected = new ImmutableSet.Builder<String>().add("AAAAAAAAAA").build();
        List<String> actual = repeatedDNA.findRepeatedDnaSequences("AAAAAAAAAAAA");
        assertEquals(expected.size(), actual.size());
        assertTrue(actual.stream().allMatch(s -> expected.contains(s)));
    }

}