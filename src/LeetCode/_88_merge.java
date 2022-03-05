package LeetCode;

import java.util.Arrays;

/**
 * 合并两个有序数组
 */
@SuppressWarnings("all")
public class _88_merge {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了17.03%的用户
     * 内存消耗：41 MB, 在所有 Java 提交中击败了36.03%的用户
     *
     * 时间复杂度：O((m+n)log(m+n))
     * 空间复杂度：O(log(m+n))
     */
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        for (int i = 0; i < n; i++) {
//            nums1[m + i] = nums2[i];
//        }
//        Arrays.sort(nums1);
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.3 MB, 在所有 Java 提交中击败了84.96%的用户
     * <p>
     * 逆向双指针，
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //从后面来，直接比较数组中最后一个元素的大小，然后再从后往前赋值nums1
        int p1 = m - 1, p2 = n - 1;
        int tail = m + n - 1;
        int cur;
        //只要有一个大于等于0，就是有元素还未进行赋值
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                //p1空了，直接从p2赋值
                cur = nums2[p2--];
            } else if (p2 == -1) {
                //p2空了，直接从p1赋值
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                //如果p1的数大于p2的数，赋值p1的数
                cur = nums1[p1--];
            } else {
                //否则赋值p2的数
                cur = nums2[p2--];
            }
            //将临时变量赋给从后往前还未赋值的第一个位置
            nums1[tail--] = cur;
        }
    }
}
