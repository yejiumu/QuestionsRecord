package LeetCode;

/**
 * 得到 0 的操作数
 *
 * @author xoke
 * @date 2022/8/7
 */
public class _2169_countOperations {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了86.92%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了52.30%的用户
     */
    public int countOperations_(int num1, int num2) {
        // 题目说什么就干什么，直接模拟
        int ans = 0;
        while (num1 != 0 && num2 != 0) {
            ans++;
            if (num1 >= num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return ans;
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.2 MB, 在所有 Java 提交中击败了78.45%的用户
     */
    public int countOperations(int num1, int num2) {
        int ans = 0;
        while (num1 != 0 && num2 != 0) {
            // 辗转相除法，太妙了
            ans += num1 / num2;
            num1 %= num2;
            // 不用额外变量的两数交换
            num1 = num1 ^ num2;
            num2 = num2 ^ num1;
            num1 = num1 ^ num2;
        }
        return ans;
    }
}
