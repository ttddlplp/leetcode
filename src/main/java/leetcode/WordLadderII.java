package leetcode;

import java.util.*;

public class WordLadderII {
    class Pair {
        public int level;
        public String word;

        public Pair(int level, String word) {
            this.level = level;
            this.word = word;
        }
    }

    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        if (beginWord == null || endWord == null || wordList == null || wordList.isEmpty() || beginWord.length() != endWord.length()) {
            return result;
        }

        wordList.add(endWord);
        Queue<Pair> cache = new LinkedList<>();
        wordList.remove(beginWord);
        Map<String, String> from = new HashMap<>();
        int currentLevel = 0;
        cache.add(new Pair(0, beginWord));
        Set<String> wordsToRemove = new HashSet<>();
        int minLevel = Integer.MAX_VALUE;
        while (!cache.isEmpty()) {
            Pair pair = cache.poll();
            String current = pair.word;
            int level = pair.level;
            if (minLevel < level) {
                continue;
            }
            if (level > currentLevel) {
                currentLevel = level;
                wordList.removeAll(wordsToRemove);
                wordsToRemove.clear();
            }
            for (String word : getAllWords(current, wordList, wordsToRemove)) {
                from.put(word, current);
                if (word.equals(endWord)) {
                    minLevel = level + 1;
                    result.add(collect(from, word));
                    continue;
                }
                cache.add(new Pair(level + 1, word));
            }
        }
        return result;
    }

    private List<String> collect(Map<String, String> from, String word) {
        LinkedList<String> result = new LinkedList<>();
        String current = word;
        while (from.containsKey(current)) {
            result.addFirst(current);
            current = from.get(current);
        }
        result.addFirst(current);
        return result;
    }

    private List<String> getAllWords(String current, Set<String> wordList, Set<String> wordsToRemove) {
        List<String> words = new ArrayList<>();
        for (int i = 0; i < current.length(); i++) {
            for (char j = 'a'; j < 'z'; j++) {
                if (j == current.charAt(i)) {
                    continue;
                }

                char[] chars = current.toCharArray();
                chars[i] = j;
                String word = new String(chars);
                if (wordList.contains(word)) {
                    wordsToRemove.add(word);
                    words.add(word);
                }
            }
        }
        return words;
    }
}
