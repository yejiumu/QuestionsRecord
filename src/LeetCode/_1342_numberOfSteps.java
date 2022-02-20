package LeetCode;

/**
 * 将数字变成 0 的操作次数
 */
public class _1342_numberOfSteps {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了5.04%的用户
     */
    public int numberOfSteps(int num) {
        int cnt = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            cnt++;
        }
        return cnt;
    }
}
