package leetcode;

import java.util.Set;

/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class WordBreak {
    public boolean wordBreak(String s, Set<String> wordDict) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        return wordBreakHelper(s, wordDict);
    }

    private boolean wordBreakHelper(String s, Set<String> wordDict) {
        boolean possible[] = new boolean[s.length() + 1];

        possible[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String currentWord = s.substring(j, i);
                possible[i] = possible[j] && (wordDict.contains(currentWord) || currentWord.isEmpty());
                if (possible[i]){
                    break;
                }
            }
        }
        return possible[s.length()];
    }
}
