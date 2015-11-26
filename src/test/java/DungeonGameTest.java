import org.junit.Test;

public class DungeonGameTest {
    @Test
    public void testName() throws Exception {
        DungeonGame dungeonGame = new DungeonGame();
        System.out.println(dungeonGame.calculateMinimumHP(new int[][] {
                { -2, -3, 3 },
                { -5, -10, 1 },
                { 10, 30, -5 } }));

    }
}
