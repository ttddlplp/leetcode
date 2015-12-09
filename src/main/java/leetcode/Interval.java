package leetcode;

import java.util.Objects;

/**
 * Created by gaoxiangzeng-personal on 15/12/9.
 */
public class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .add("start", start)
                .add("end", end)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return Objects.equals(start, interval.start) &&
                Objects.equals(end, interval.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }
}
