package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/1.
 */
public class PermutationSequence {
    public String getPermutation(int n, int k) {
        if (k < 1 || n < 1 || n > 9) {
            return null;
        }

        Counter count = new Counter();
        boolean[] visited = new boolean[n];
        return dfs(n, k, count, "", visited);
    }

    class Counter {
        int val = 0;
        public void inc(){
            val++;
        }
    }

    private String dfs(int n, int k, Counter count, String s, boolean[] visited) {
        if (s.length() == n) {
            count.inc();
            if (count.val == k) {
                return s;
            } else {
                return null;
            }
        }


        for (int j = 0; j < n; j++) {
            if (!visited[j]) {
                visited[j] = true;
                String result = dfs(n, k, count, s.concat(String.valueOf(j + 1)), visited);
                if (result != null) return result;
                visited[j] = false;
            }
        }
        return null;
    }
}
