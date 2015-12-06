package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class LongSubWithNoRepeat {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int start = 0;
        int end = 1;
        Map<Character, Integer> charLocationMap = new HashMap<>();
        charLocationMap.put(s.charAt(start), start);

        int max = 1;

        while (end < s.length()) {
            char c = s.charAt(end);
            if (!charLocationMap.containsKey(c) || charLocationMap.get(c) < start) {
                charLocationMap.put(c, end);
            } else {
                start = charLocationMap.get(c) + 1;
                charLocationMap.put(c, end);
            }
            end++;
            int currentLength = end - start;
            if (currentLength > max) {
                max = currentLength;
            }
        }
        return max;
    }
}
