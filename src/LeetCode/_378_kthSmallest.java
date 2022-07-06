package LeetCode;

/**
 * 有序矩阵中第 K 小的元素
 */
public class _378_kthSmallest {
    /**
     * 执行用时：8 ms, 在所有 Java 提交中击败了44.52%的用户
     * 内存消耗：46.6 MB, 在所有 Java 提交中击败了79.76%的用户
     */
//    public int kthSmallest(int[][] matrix, int k) {
//        int len = matrix.length;
//        int[] arr = new int[len * len];
//        int index = 0;
//        for (int[] ints : matrix) {
//            for (int num : ints) {
//                arr[index++] = num;
//            }
//        }
//        Arrays.sort(arr);
//        return arr[k - 1];
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：47.3 MB, 在所有 Java 提交中击败了15.91%的用户
     */
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n - 1][n - 1];
        // 二分查找
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            // 判断目前这个数在左右区间的位置
            if (check(matrix, mid, k, n)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean check(int[][] matrix, int mid, int k, int n) {
        int i = n - 1;
        int j = 0;
        int num = 0;
        // 从右下角开始寻找
        while (i >= 0 && j < n) {
            if (matrix[i][j] <= mid) {
                num += i + 1;
                j++;
            } else {
                i--;
            }
        }
        return num >= k;
    }
}
