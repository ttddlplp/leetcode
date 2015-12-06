package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperator {
    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        if (num == null || num.isEmpty()) {
            return result;
        }
        
        bfs(result, getNextValRemovedString(num), target, nextVal(num), nextVal(num), String.valueOf(nextVal(num)));
        return result;
    }

    private void bfs(List<String> result, String num, int target,int last, int current, String currentString) {
        if (num.isEmpty()) {
            if (target == current ) {
                result.add(currentString);
            }
            return;
        }

        Integer nextVal = nextVal(num);
        bfs(result, getNextValRemovedString(num), target, nextVal,  current + nextVal, currentString + "+" + nextVal);
        bfs(result, getNextValRemovedString(num), target, -nextVal, current - nextVal, currentString + "-" + nextVal);
        bfs(result, getNextValRemovedString(num), target, nextVal * last, current - last + nextVal * last, 
                currentString + "*" + nextVal);

    }

    private String getNextValRemovedString(String num) {
        return num.replaceFirst(String.valueOf(nextVal(num)), "");
    }

    private Integer nextVal(String num) {
        int index = 1;
        while (index < num.length() && num.charAt(index) == '0') {
            index ++;
        }
        return Integer.valueOf(num.substring(0, index));
    }
}
