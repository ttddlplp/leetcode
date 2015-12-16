package leetcode;

import java.util.*;

public class WordLadder {
    class Pair {
        public String word;
        public int level;

        public Pair(String word, int level) {
            this.word = word;
            this.level = level;
        }
    }

    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        if (beginWord == null || endWord == null || wordList.isEmpty()) {
            return 0;
        }
        wordList.add(endWord);
        Queue<Pair> cache = new LinkedList<>();
        cache.add(new Pair(beginWord, 1));
        while (!cache.isEmpty()) {
            Pair pair = cache.poll();
            String currentWord = pair.word;
            int level = pair.level;
            for (String word : getAllPermutation(currentWord, wordList)) {
                if (word.equals(endWord)) {
                    return level + 1;
                }
                cache.add(new Pair(word, level + 1));
            }
        }
        return 0;
    }

    private List<String> getAllPermutation(String currentWord, Set<String> wordList) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < currentWord.length(); i++) {
            for (char c = 'a'; c <= 'z'; c ++) {
                if (c != currentWord.charAt(i)){
                    char[] chars = currentWord.toCharArray();
                    chars[i] = c;
                    String word = new String(chars);
                    if (wordList.contains(word)) {
                        wordList.remove(word);
                        result.add(word);
                    }
                }
            }
        }
        return result;
    }
}
