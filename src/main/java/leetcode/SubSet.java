package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gaoxiangzeng-personal on 15/11/25.
 */
public class SubSet {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultSet = new ArrayList<>();
        resultSet.add(new ArrayList<>());
        for (int num : nums) {
            List<List<Integer>> newList = new ArrayList<>();
            for (List<Integer> integers : resultSet) {
                List<Integer> added = new ArrayList<>(integers);
                added.add(num);
                newList.add(added);
            }
            resultSet.addAll(newList);
        }
        return resultSet;
    }
}
