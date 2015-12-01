import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/1.
 */
public class PermutationSequenceTest {
    @Test
    public void testName() throws Exception {
        PermutationSequence permutationSequence = new PermutationSequence();
        assertEquals("321", permutationSequence.getPermutation(3, 6));
    }

    @Test
    public void testName2() throws Exception {
        PermutationSequence permutationSequence = new PermutationSequence();
        assertEquals("12", permutationSequence.getPermutation(2, 1));
    }

    @Test
    public void testName3() throws Exception {
        PermutationSequence permutationSequence = new PermutationSequence();
        assertEquals("12", permutationSequence.getPermutation(9, 136371));
    }
}