package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OwnSetTest {

    private OwnSet ownSet;

    @Before
    public void setUp() throws Exception {
        ownSet = new OwnSet();
    }

    @Test
    public void testAdd() throws Exception {
        ownSet.add(5);
    }

    @Test
    public void testContains() throws Exception {
        ownSet.add(5);
        assertTrue(ownSet.contains(5));
    }

    @Test
    public void testNotContains() throws Exception {
        ownSet.add(6);
        assertFalse(ownSet.contains(5));
    }

    @Test
    public void testMultipleContains() throws Exception {
        ownSet.add(5);
        ownSet.add(6);
        assertTrue(ownSet.contains(5));
        assertTrue(ownSet.contains(6));
    }

    @Test
    public void testRemove() throws Exception {
        ownSet.add(5);
        ownSet.remove(5);
        assertFalse(ownSet.contains(5));
    }

    @Test
    public void testMultipleInsertOnlyUpdate() throws Exception {
        ownSet.add(5);
        ownSet.add(5);
        assertTrue(ownSet.contains(5));
        ownSet.remove(5);
        assertFalse(ownSet.contains(5));
    }

    @Test
    public void testInsertLargeValue() throws Exception {
        ownSet.add(2000);
        assertTrue(ownSet.contains(2000));
    }

    @Test
    public void testHashCollision() throws Exception {
        ownSet.add(1007);
        assertFalse(ownSet.contains(2014));
    }
}
