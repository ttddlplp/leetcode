package leetcode;

import java.util.*;

/**
 * Created by gaoxiangzeng-personal on 15/12/4.
 */
public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses <= 0 || prerequisites == null) {
            return null;
        }

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            if (!map.containsKey(prerequisite[1])) {
                map.put(prerequisite[1], new ArrayList<>());
            }
            map.get(prerequisite[1]).add(prerequisite[0]);
        }

        boolean[] visited = new boolean[numCourses];
        Stack<Integer> resultStack = new Stack<>();
        boolean isValid = true;
        for (int i = 0; i < numCourses; i++) {
            Set<Integer> detectSet = new HashSet<>();
                isValid = isValid && dfs(i, visited, map, resultStack, detectSet);
        }
        if (!isValid) {
            return new int[]{};
        }

        int[] result = new int[resultStack.size()];
        int i = 0;
        while (!resultStack.empty()) {
            result[i++] = resultStack.pop();
        }
        return result;
    }

    private boolean dfs(int i, boolean[] visited, HashMap<Integer, List<Integer>> map, Stack<Integer> resultStack, Set<Integer> detectSet) {
        boolean result = true;
        if (!visited[i]) {
            visited[i] = true;
            detectSet.add(i);
            if (map.containsKey(i)) {
                for (Integer course : map.get(i)) {
                    if (detectSet.contains(course)) {
                        result = false;
                    }
                    if (!visited[course]) {
                        result = result && dfs(course, visited, map, resultStack, detectSet);
                    }
                }
            }
            detectSet.remove(i);
            resultStack.push(i);
        }
        return result;
    }
}
