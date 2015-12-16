package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoxiangzeng-personal on 15/12/12.
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0) {
            return result;
        }

        generate(n, 0, "", result);
        return result;
    }

    private void generate(int n, int numOfleftP, String path, List<String> result) {
        if (n == 0 && numOfleftP == 0) {
            result.add(path);
            return;
        }

        if (n > 0) {
            generate(n - 1, numOfleftP + 1, path + "(", result);
        }

        if (numOfleftP > 0) {
            generate(n, numOfleftP - 1, path + ")", result);
        }
    }
}
