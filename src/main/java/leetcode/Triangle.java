package leetcode;

import java.util.List;

/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.isEmpty()) {
            return 0;
        }

        int[] cache = new int[triangle.get(triangle.size() - 1).size()];
        cache[0] = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> row = triangle.get(i);
            cache[row.size() - 1] = cache[row.size() - 2];
            for (int j = row.size() - 1; j >= 0; j--) {
                Integer elem = row.get(j);
                int left = Integer.MAX_VALUE;
                if (j - 1 >= 0) {
                    left = cache[j - 1];
                }
                int right = cache[j];
                cache[j] = elem + Math.min(left, right);
            }
        }

        int min = Integer.MAX_VALUE;
        for (Integer elem : cache) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }
}
