package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        if (s == null || s.isEmpty()) {
            return result;
        }
        
        helper(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void helper(String s, int start, List<String> sol, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(sol));
        }

        for (int i = start + 1; i <= s.length(); i++) {
            String substring = s.substring(start, i);
            if (isPalindrom(substring)) {
                sol.add(substring);
                helper(s, i, sol, result);
                sol.remove(sol.size() - 1);
            }
        }
    }

    private boolean isPalindrom(String substring) {
        int left = 0;
        int right = substring.length() - 1;
        
        while (left <= right) {
            if (substring.charAt(left++) != substring.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
