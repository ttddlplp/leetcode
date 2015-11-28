/**
 * Created by gaoxiangzeng-personal on 15/11/28.
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || cost == null || gas.length != cost.length || gas.length < 1) {
            return -1;
        }

        long total = 0;
        long accumulate = 0;
        int startNode = 0;
        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;

            accumulate += diff;
            if (accumulate < 0) {
                accumulate = 0;
                startNode = i + 1;
            }
        }

        if (total < 0) {
            return -1;
        }
        return startNode;
    }
}
