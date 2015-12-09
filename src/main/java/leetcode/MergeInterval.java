package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by gaoxiangzeng-personal on 15/12/9.
 */
public class MergeInterval {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null) {
            return new ArrayList<>();
        }

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return Integer.compare(o1.start, o2.start);
            }
        });
        List<Interval> result = new ArrayList<>();
        for (Interval interval : intervals) {
            if (result.isEmpty()) {
                result.add(interval);
                continue;
            }

            Interval last = result.get(result.size() - 1);
            if (last.end >= interval.start) {
                last.end = Math.max(interval.end, last.end);
            } else {
                result.add(interval);
            }
        }

        return result;
    }
}
