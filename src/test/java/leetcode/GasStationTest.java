package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/11/28.
 */
public class GasStationTest {

    @Test
    public void testName() throws Exception {
        GasStation gasStation = new GasStation();
        assertEquals(0, gasStation.canCompleteCircuit(new int[]{5}, new int[]{3}));
    }

    @Test
    public void testName1() throws Exception {
        GasStation gasStation = new GasStation();
        assertEquals(0, gasStation.canCompleteCircuit(new int[]{5, 6}, new int[]{3, 4}));
    }

    @Test
    public void testName3() throws Exception {
        GasStation gasStation = new GasStation();
        assertEquals(-1, gasStation.canCompleteCircuit(new int[]{5}, new int[]{9}));
    }

    @Test
    public void testName4() throws Exception {
        GasStation gasStation = new GasStation();
        assertEquals(0, gasStation.canCompleteCircuit(new int[]{9, 10}, new int[]{5, 9}));
    }

    @Test
    public void testName5() throws Exception {
        GasStation gasStation = new GasStation();
        assertEquals(1, gasStation.canCompleteCircuit(new int[]{4, 15}, new int[]{5, 9}));
    }

    @Test
    public void testName6() throws Exception {
        GasStation gasStation = new GasStation();
        assertEquals(2, gasStation.canCompleteCircuit(new int[]{4, 3, 15}, new int[]{5, 9, 3}));
    }

    @Test
    public void testName7() throws Exception {
        GasStation gasStation = new GasStation();
        assertEquals(1, gasStation.canCompleteCircuit(new int[]{4, Integer.MAX_VALUE, 15}, new int[]{6, 9, 3}));
    }

    @Test
    public void testName8() throws Exception {
        GasStation gasStation = new GasStation();
        assertEquals(-1, gasStation.canCompleteCircuit(new int[]{4, 6, 15}, new int[]{2, 9, Integer.MAX_VALUE}));
    }

    @Test
    public void testName9() throws Exception {
        GasStation gasStation = new GasStation();
        assertEquals(2, gasStation.canCompleteCircuit(new int[]{Integer.MAX_VALUE, 6, Integer.MAX_VALUE},
                new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 4}));
    }

    @Test
    public void testName10() throws Exception {
        GasStation gasStation = new GasStation();
        assertEquals(2, gasStation.canCompleteCircuit(new int[]{1, 6, 5, 7},
                new int[]{2, 9, 3, 1}));
    }
}