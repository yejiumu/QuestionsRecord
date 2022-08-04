package LeetCode.剑指offer.I;

/**
 * 青蛙跳台阶问题
 *
 * @author xoke
 * @date 2022/8/4
 */
public class _10_2_numWays {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.5 MB, 在所有 Java 提交中击败了14.93%的用户
     */
    public int numWays(int n) {
        int[] arr = new int[110];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000007;
        }
        return arr[n];
    }
}
