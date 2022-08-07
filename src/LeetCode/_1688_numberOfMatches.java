package LeetCode;

/**
 * 比赛中的配对次数
 */
public class _1688_numberOfMatches {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.2 MB, 在所有 Java 提交中击败了5.01%的用户
     */
    public static int numberOfMatches_(int n) {
        int result = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                result += n;
            } else {
                n = (n - 1) / 2;
                result += n;
                n++;
            }
        }
        return result;
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了49.21%的用户
     * <p>
     * 这就是数学吗，太BT了
     */
    public static int numberOfMatches(int n) {
        // 配对次数就是淘汰的队伍数
        // 因为最后肯定是只剩下一支队伍，所以就直接n-1
        return n - 1;
    }
}
