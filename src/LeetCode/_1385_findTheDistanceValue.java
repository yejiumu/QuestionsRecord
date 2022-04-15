package LeetCode;

import java.util.Arrays;

/**
 * 两个数组间的距离值
 */
public class _1385_findTheDistanceValue {
    /**
     * 执行用时：16 ms, 在所有 Java 提交中击败了19.18%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了22.06%的用户
     */
//    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
//        int ans = 0;
//        // 直接遍历查找，是否符合条件
//        for (int i : arr1) {
//            boolean ok = true;
//            for (int j : arr2) {
//                ok &= Math.abs(i - j) > d;
//            }
//            ans += ok ? 1 : 0;
//        }
//        return ans;
//    }
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了51.36%的用户
     * 内存消耗：40.7 MB, 在所有 Java 提交中击败了80.21%的用户
     */
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int cnt = 0;
        for (int x : arr1) {
            int p = binarySearch(arr2, x);
            boolean ok = true;
            if (p < arr2.length) {
                ok &= arr2[p] - x > d;
            }
            if (p - 1 >= 0 && p - 1 <= arr2.length) {
                ok &= x - arr2[p - 1] > d;
            }
            cnt += ok ? 1 : 0;
        }
        return cnt;
    }

    public int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        if (arr[high] < target) {
            return high + 1;
        }
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
