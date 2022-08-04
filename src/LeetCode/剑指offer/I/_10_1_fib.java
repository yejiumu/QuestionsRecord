package LeetCode.剑指offer.I;

/**
 * 斐波那契数列
 *
 * @author xoke
 * @date 2022/8/4
 */
public class _10_1_fib {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了26.65%的用户
     */
    public int fib(int n) {
        // 直接创建足够大的数组，不用担心n太小或者太大
        int[] arr = new int[110];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            // 从第2项开始，等于前一项与前两项的和对1000000007取余
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000007;
        }
        // 直接返回对应位置即可
        return arr[n];
    }
}
