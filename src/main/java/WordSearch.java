public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (board == null || word == null) {
            return false;
        }
        
        if (word.isEmpty()) {
            return true;
        }

        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(i, j, 0, board, word, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int index, char[][] board, String word, boolean[][] visited) {
        if (word.length() == index) {
            return true;
        } 
        
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || visited[i][j] || word.charAt(index) !=
                board[i][j]) {
            return false;
        }
        
        visited[i][j] = true;
        if (dfs(i + 1, j, index + 1, board, word, visited)) {
            return true;
        }
        
        if (dfs(i - 1, j, index + 1, board, word, visited)) {
            return true;
        }
        
        if (dfs(i, j + 1, index + 1, board, word, visited)) {
            return true;
        }
        
        if (dfs(i, j - 1, index + 1, board, word, visited)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
