import java.util.Arrays;

/**
 * Created by gaoxiangzeng-personal on 15/11/19.
 */
public class GameOfLife {
    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife();
        int[][] board = {{0,0,0,0},{0,1,1,0},{0,1,1,0},{0,0,0,0}};
        gameOfLife.gameOfLife(board);
        System.out.println(Arrays.deepToString(board));
    }

    public void gameOfLife(int[][] board) {
        if (board == null) {
            return;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int lives = getLives(board, i , j);
                board[i][j] = getTransition(lives, board[i][j]);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = board[i][j] % 2;
            }
        }
    }

    private int getTransition(int lives, int status) {
        if (lives < 2 || lives > 3) {
            if (status == 0) {
                return 0;
            } else {
                return 2;
            }
        } else {
            if (lives == 2) {
                if (status == 0) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                if (status == 0) {
                    return 3;
                } else {
                    return 1;
                }
            }
        }
    }

    private int getLives(int[][] board, int x, int y) {
        int lives = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || (i == x && j == y)) {
                    continue;
                }

                if (board[i][j] == 1 || board[i][j] == 2) {
                    lives++;
                }
            }
        }
        return lives;
    }
}
