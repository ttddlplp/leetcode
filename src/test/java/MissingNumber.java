import java.util.BitSet;

/**
 * Created by gaoxiangzeng-personal on 15/11/16.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        BitSet bitSet = new BitSet();
        for (int num : nums) {
            bitSet.set(num);
        }
        return bitSet.nextClearBit(0);
    }
}
