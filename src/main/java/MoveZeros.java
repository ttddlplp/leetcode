/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }

        int saveTo = 0;
        int current = 0;
        while(current < nums.length) {
            if (nums[current] != 0) {
                nums[saveTo++] = nums[current];
            }
            current++;
        }
        while(saveTo < nums.length) {
            nums[saveTo++] = 0;
        }
    }
}
