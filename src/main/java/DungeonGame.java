import java.util.Arrays;

public class DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        int maxY = dungeon.length - 1;
        int maxX = dungeon[0].length - 1;

        int[][] dp = new int[dungeon.length + 1][dungeon[0].length + 1];
        int[][] buffer = new int[dungeon.length + 1][dungeon[0].length + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], 1);
        }
        for (int i = 0; i < dungeon.length; i++) {
            for (int j = 0; j < dungeon[i].length; j++) {

                int minLeftLife = dp[i + 1][j];
                int minTopLife = dp[i][j + 1];
                int currentLife = Math.min(minLeftLife, minTopLife);
                int currentBuffer;
                
                if (minLeftLife < minTopLife) {
                    currentBuffer = buffer[i + 1][j];
                } else {
                    currentBuffer = buffer[i][j + 1];
                }

                int value = dungeon[i][j];
                if (value >= 0) {
                    buffer[i + 1][j + 1] = currentBuffer + value;
                    dp[i + 1][j + 1] = value * -1 + currentLife;
                } else {
                    int remainBuffer = currentBuffer - value;
                    if (remainBuffer > 0) {
                        buffer[i + 1][j + 1] = remainBuffer + value;
                        dp[i + 1][j + 1] = currentLife;
                    } else {
                        buffer[i + 1][j + 1] = 0;
                        dp[i + 1][j + 1] = remainBuffer * -1 + currentLife;
                    }
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        System.out.println("----------");

        for (int i = 0; i < buffer.length; i++) {
            System.out.println(Arrays.toString(buffer[i]));
        }

        return dp[maxX + 1][maxY + 1];
    }
}
