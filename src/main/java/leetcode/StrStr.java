package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/1.
 */
public class StrStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }

        int start = 0;

        while (start <= haystack.length() - needle.length()) {
            int matchedIndex = 0;
            while (matchedIndex < needle.length() && haystack.charAt(start + matchedIndex) == needle.charAt(matchedIndex)) {
                matchedIndex++;
            }
            if (matchedIndex == needle.length()) {
                return start;
            }
            start ++;
        }

        return -1;
    }
}
