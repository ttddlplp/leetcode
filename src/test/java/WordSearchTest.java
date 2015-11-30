import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordSearchTest {

    private WordSearch wordSearch;

    @Before
    public void setUp() throws Exception {
        wordSearch = new WordSearch();
    }

    @Test
    public void testNull() throws Exception {
        assertFalse(wordSearch.exist(null, null));
    }

    @Test
    public void test1() throws Exception {
        char [][] board = new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        assertTrue(wordSearch.exist(board, "ABCCED"));
        assertTrue(wordSearch.exist(board, "SEE"));
        assertFalse(wordSearch.exist(board, "ABCB"));
    }
    
    @Test
    public void test5() throws Exception {
        char [][] board = new char[][] {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        assertTrue(wordSearch.exist(board, "ABCESEEEFS"));
    }
    
    @Test
    public void test2() throws Exception {
        char [][] board = new char[][] {{'A','B','C','E','F','G'}};
        assertTrue(wordSearch.exist(board, "ABCE"));
        assertFalse(wordSearch.exist(board, "ABCD"));
    }
    
    @Test
    public void test3() throws Exception {
        char [][] board = new char[][] {{'A'},{'B'},{'C'},{'E'},{'A'}};
        assertTrue(wordSearch.exist(board, "ABCE"));
        assertFalse(wordSearch.exist(board, "ABCD"));
    }
    
    @Test
    public void test4() throws Exception {
        char [][] board = new char[][] {{'A'},{'B'},{'C'},{'E'},{'A'}};
        assertTrue(wordSearch.exist(board, ""));
    }
}
