package LeetCode;

/**
 * 存在连续三个奇数的数组
 */
public class _1550_threeConsecutiveOdds {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了18.12%的用户
     */
    public boolean threeConsecutiveOdds(int[] arr) {
        int len = arr.length;
        // en，很简单
        for (int i = 0; i <= len - 3; i++) {
            if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
