package leetcode.benchmarking;

import leetcode.ContainsDuplicateII;
import org.openjdk.jmh.annotations.Benchmark;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class Benchmarking {

    private static int[] testData = setupTestData();

    @Benchmark
    public void testMethod() {
        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        containsDuplicateII.containsNearbyDuplicate(setupTestData(), 5);
    }

    @Benchmark
    public void testMethod2() {
        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        containsDuplicateII.containsNearbyDuplicateSlow(setupTestData(), 5);
    }

    private static int[] setupTestData() {
        int[] testData = new int[20000];
        for (int i = 0; i < testData.length; i++) {
            testData[i] = i;
        }
        return testData;
    }
}
