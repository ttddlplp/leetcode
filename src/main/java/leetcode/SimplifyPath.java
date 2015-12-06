package leetcode;

import java.util.Stack;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        if (path == null || path.isEmpty()) {
            return "/";
        }

        String[] split = path.split("/");

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(".") || split[i].isEmpty()) {
                continue;
            }

            if (split[i].equals("..") && !stack.empty()) {
                stack.pop();
                continue;
            }
            if (!stack.empty() || !split[i].equals("..")){
                stack.push(split[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("/");
        while (!stack.empty()) {
            sb.insert(1, stack.pop() + "/");
        }
        if (sb.length() > 1) {
            sb = sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
