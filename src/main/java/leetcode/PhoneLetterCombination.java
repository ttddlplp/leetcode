package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gaoxiangzeng-personal on 15/12/9.
 */
public class PhoneLetterCombination {
    Map<Character, String> map = new HashMap<>();
    public PhoneLetterCombination() {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            String s = map.get(digits.charAt(i));
            List<String> current = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                for (String s1 : result) {
                    current.add(s1 + s.charAt(j));
                }
            }
            result = current;
        }

        return result;
    }
}
