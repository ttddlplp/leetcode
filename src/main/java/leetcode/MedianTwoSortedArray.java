package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class MedianTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalSize = nums1.length + nums2.length;
        if (totalSize % 2 != 0) {
            return findKthElements(totalSize / 2, nums1, nums2);
        } else {
            return findKthElements(totalSize / 2 - 1, nums1, nums2) * 0.5 + findKthElements(totalSize / 2, nums1, nums2);
        }

    }

    public int findKthElements(int k, int[] nums1, int[] nums2) {
        return kth(k, nums1, nums2, 0, nums1.length - 1, 0, nums2.length - 1);
    }


    private int kth(int k, int[] a, int[] b, int a_start, int a_end, int b_start, int b_end) {
        if (a_start > a_end) return b[b_start + k - 1];
        if (b_start > b_end) return a[a_start + k - 1];

        int a_mid = a_start + (a_end - a_start) / 2;
        int b_mid = b_start + (b_end - b_start) / 2;
        int x = a_mid - a_start + 1;
        int y = b_mid - b_start + 1;

        if (a[a_mid] <= b[b_mid]) {
            if (k < x + y) {
                return kth(k, a, b, a_start, a_end, b_start, b_mid - 1);
            } else {
                return kth(k - x, a, b, a_mid + 1, a_end, b_start, b_end);
            }
        } else {
            if (k < x + y) {
                return kth(k, a, b, a_start, a_mid - 1, b_start, b_end);
            } else {
                return kth(k - y, a, b, a_start, a_end, b_mid + 1, b_end);
            }
        }
    }

    private int find(int k, int[] nums1, int[] nums2, int m1, int m2, int n1, int n2) {
        System.out.println("x:" + m1 + "|" + m2);
        System.out.println("y:" + n1 + "|" + n2);

        if (k <= 1) {
            return Math.min(nums1[0], nums2[0]);
        }
        if (m2 < m1) {
            return nums2[n1 + k];
        }

        if (n1 == n2) {
            return nums1[m1 + k];
        }

        int nums1Mid = m1 + (m2 - m1) / 2;
        int nums2Mid = n1 + (n2 - n1) / 2;
        if (m2 - m1 + n2 - n1 + 1 > k) {
            if (nums1[(nums1Mid)] > nums2[(nums2Mid)]) {
                return find(k, nums1, nums2, m1, nums1Mid, n1, n2);
            } else {
                return find(k, nums1, nums2, m1, m2, n1, nums2Mid);
            }
        } else {
            if (nums1[(nums1Mid)] < nums2[(nums2Mid)]) {
                return find(k - nums1Mid, nums1, nums2, nums1Mid + 1, m2, n1, n2);
            } else {
                return find(k - nums2Mid, nums1, nums2, m1, m2, nums2Mid + 1, n2);
            }
        }
    }


}
