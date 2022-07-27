package LeetCode;

/**
 * 反转两次的数字
 *
 * @author xoke
 * @date 2022/7/27
 */
public class _2119_isSameAfterReversals {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.2 MB, 在所有 Java 提交中击败了69.80%的用户
     */
    public boolean isSameAfterReversals(int num) {
        if (num == 0) {
            // num 为0直接返回true
            return true;
        }
        // 如果是10的倍数(即有尾巴0)，返回false，否则为true
        return num % 10 != 0;
    }
}
