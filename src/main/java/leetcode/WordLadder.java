package leetcode;

import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Queue<String> cache = new LinkedList<>();

        Set<String> visited = new HashSet<>();
        Map<String, String> from = new HashMap<>();
        cache.add(beginWord);
        while (!cache.isEmpty()) {
            String currentWord = cache.poll();
            for (String word : getAllPermutation(currentWord)) {
                if (!visited.contains(word) && wordList.contains(word)) {
                    cache.add(word);
                    from.put(word, currentWord);
                    if (word.equals(endWord)) {
                        return getPathLength(from, word);
                    }
                }
            }
        }
        return 0;
    }

    private int getPathLength(Map<String, String> from, String word) {
        int i = 0;

        String currentWord = word;
        while (from.containsKey(currentWord)) {
            i++;
            currentWord = from.get(currentWord);
        }
        return i;
    }

    private List<String> getAllPermutation(String currentWord) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < currentWord.length(); i++) {
            for (char c = 'a'; c <= 'z'; c ++) {
                if (c != currentWord.charAt(i)){
                    char[] chars = currentWord.toCharArray();
                    chars[i] = c;
                    result.add(new String(chars));
                }
            }
        }
        return result;
    }
}
