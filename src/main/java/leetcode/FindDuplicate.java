package leetcode;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int step1 = 0;
        int step2 = 0;

        while (true) {
            step1 = nums[step1];
            step2 = nums[nums[step2]];

            if(step1 == step2) break;
        }

        int restart = 0;
        while(true) {
            step1 = nums[step1];
            restart = nums[restart];

            if(step1 == restart) {
                return step1;
            }
        }
    }
}
