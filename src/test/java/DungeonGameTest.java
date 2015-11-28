import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DungeonGameTest {

    private DungeonGame dungeonGame;

    @Before
    public void setUp() throws Exception {
        dungeonGame = new DungeonGame();
    }

    @Test
    public void testName() throws Exception {
        System.out.println(dungeonGame.calculateMinimumHP(new int[][]{
                {-2, -3, 3},
                {-5, -10, 1},
                {10, 30, -5}}));

    }

    @Test
    public void testNull() throws Exception {
        System.out.println(dungeonGame.calculateMinimumHP(new int[][]{}));
    }

    @Test
    public void testFailed() throws Exception {
        System.out.println(dungeonGame.calculateMinimumHP(new int[][]{{0, 0}}));
    }

    @Test
    public void testFailed2() throws Exception {
        System.out.println(dungeonGame.calculateMinimumHP(new int[][]{{0, 0, 0}, {1, 1, -1}}));
    }

    @Test
    public void testFailed3() throws Exception {
        assertEquals(2, dungeonGame.calculateMinimumHP(new int[][]{{1, -2, 3}, {2, -2, -2}}));

    }

    @Test
    public void testFailed4() throws Exception {
        assertEquals(3, dungeonGame.calculateMinimumHP(new int[][]{{1,-3,3},{0,-2,0},{-3,-3,-3}}));

    }
    
    @Test
    public void testFailed5() throws Exception {
        assertEquals(1, dungeonGame.calculateMinimumHP(new int[][]{{3,-20,30},{-3,4,0}}));

    }
}
