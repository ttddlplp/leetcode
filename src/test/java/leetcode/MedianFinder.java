package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {

    private Queue<Integer> smalllQueue = new PriorityQueue<>();
    private Queue<Integer> bigQueue = new PriorityQueue<>();
    public void addNum(int num) {
        smalllQueue.add(num);
        bigQueue.add(-smalllQueue.poll());
        if (bigQueue.size() > smalllQueue.size()) {
            smalllQueue.add(-bigQueue.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        if (smalllQueue.size() > bigQueue.size()) {
            return smalllQueue.peek();
        } else {
            return (smalllQueue.peek() - bigQueue.peek()) * 0.5;
        }
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian());
    }
}