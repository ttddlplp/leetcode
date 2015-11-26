import java.util.Arrays;

public class DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        int maxY = dungeon.length - 1;
        int maxX = dungeon[0].length - 1;

        int[][] dp = new int[dungeon.length + 1][dungeon[0].length + 1];
        int[][] buffer = new int[dungeon.length + 1][dungeon[0].length + 1];
        Arrays.fill(dp, 1);
        for (int i = 0; i < dungeon.length; i++) {
            for (int j = 0; j < dungeon[i].length; j++) {
                int value = dungeon[i][j];
                int currentBuffer = Math.max(buffer[i][j - 1], buffer[i - 1][j]);
                int currentLife = Math.min(dp[i][j + 1], dp[i - 1][j]);
                if (value >= 0) {
                    buffer[i + 1][j + 1] = currentBuffer + value;
                    dp[i + 1][j + 1] = value * -1 + Math.min(dp[i][j + 1], dp[i - 1][j]);
                } else {
                    int damage = currentBuffer + 
                    dp[i + 1][j + 1] = damage * -1 + Math.min(dp[i][j + 1], dp[i - 1][j]);
                }
            }
        }
        return dp[maxX + 1][maxY + 1];
    }
}
