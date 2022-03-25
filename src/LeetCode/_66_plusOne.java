package LeetCode;

/**
 * 加一
 */
public class _66_plusOne {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.7 MB, 在所有 Java 提交中击败了39.40%的用户
     */
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        // 从后往前遍历，找到第一个不是9的位置
        for (int i = len - 1; i >= 0; --i) {
            if (digits[i] != 9) {
                // 将该位置的值进位
                ++digits[i];
                // 将该位置后面的元素进行重置
                for (int j = i + 1; j < len; j++) {
                    digits[j] = 0;
                }
                // 返回该数组
                return digits;
            }
        }
        // 如果每个位置上的值都是9，创建一个新数组
        int[] res = new int[len + 1];
        // 将开头数值赋值为1即可
        res[0] = 1;
        return res;
    }
}
