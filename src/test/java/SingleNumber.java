/**
 * Created by gaoxiangzeng-personal on 15/11/19.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            start ^= nums[i];
        }
        return start;
    }
}
