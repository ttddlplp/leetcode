package leetcode;

import java.util.HashMap;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (!sMap.containsKey(sc) && !tMap.containsKey(tc)) {
                sMap.put(sc, tc);
                tMap.put(tc, sc);
            } else {
                if (!sMap.containsKey(sc) || !tMap.containsKey(tc)) {
                    return false;
                }

                if (!sMap.get(sc).equals(tc) || !tMap.get(tc).equals(sc)) {
                    return false;
                }
            }
        }
        return true;
    }
}
