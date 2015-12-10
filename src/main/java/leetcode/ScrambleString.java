package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by gaoxiangzeng-personal on 15/12/10.
 */
public class ScrambleString {
    Map<Key, Boolean> cache = new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        cache.clear();
        return isScrambleHelper(s1, s2);
    }

    private boolean isScrambleHelper(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        int length = s1.length();

        if(length == 1) {
            return s1.equals(s2);
        }


        for (int i = 1; i < length; i++) {
            boolean result = (getOrCalculate(s1.substring(0, i), s2.substring(0, i))
                    && getOrCalculate(s1.substring(i, length), s2.substring(i, length)))
                    || (getOrCalculate(s1.substring(0, i), s2.substring(length - i, length))
                    && getOrCalculate(s1.substring(length - i, length), s2.substring(0, i)));
            if (result) {
                return true;
            }
        }

        return false;
    }

    private boolean getOrCalculate(String substring, String substring2) {
        Key key = new Key(substring, substring2);
        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            boolean result = isScramble(substring, substring2);
            cache.put(key, result);
            return result;
        }
    }

    class Key {
        Key(String left, String right) {
            this.left = left;
            this.right = right;
        }

        String left;
        String right;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return Objects.equals(left, key.left) &&
                    Objects.equals(right, key.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(left, right);
        }
    }
}
