package LeetCode;

/**
 * 第 N 个泰波那契数
 *
 * @author xoke
 * @date 2022/8/5
 */
public class _1137_tribonacci {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.2 MB, 在所有 Java 提交中击败了59.97%的用户
     */
    public int tribonacci(int n) {
        int[] arr = new int[50];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        // 有公式的动态规划
        for (int i = 3; i <= n; i++) {
            arr[i] += arr[i - 3] + arr[i - 2] + arr[i - 1];
        }
        return arr[n];
    }
}
