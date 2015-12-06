package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoxiangzeng-personal on 15/11/29.
 */
public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        if (k < 0 || n < 0) {
            return result;
        }
        
        dfs(result, 1, k, n, new ArrayList<>());

        return result;
    }

    private void dfs(List<List<Integer>> result, int start, int k, int n, ArrayList<Integer> integers) {
        if (n == 0 && integers.size() == k) {
            result.add(new ArrayList<>(integers));
        } else if (integers.size() == k) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            integers.add(i);
            dfs(result, i + 1, k, n - i, integers);
            integers.remove(integers.size() - 1);
        }
    }
}
