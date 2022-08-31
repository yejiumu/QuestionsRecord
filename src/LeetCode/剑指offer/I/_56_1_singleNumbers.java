package LeetCode.剑指offer.I;

/**
 * 数组中数字出现的次数
 *
 * @author xoke
 * @date 2022/8/31
 */
public class _56_1_singleNumbers {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：43.1 MB, 在所有 Java 提交中击败了35.12%的用户
     */
    public int[] singleNumbers(int[] nums) {
        // x 为 num1 与 num2 异或的结果
        // m 为 num1 与 num2 二进制位中第一位不同的位置
        int num1 = 0, num2 = 0, x = 0, m = 1;
        // 遍历异或，得出 x
        for (int num : nums) {
            x ^= num;
        }
        // 得到两数二进制位中第一位不同的位置
        while ((x & m) == 0) {
            m <<= 1;
        }
        for (int num : nums) {
            // 以 m 为界线分为两组，进行异或操作
            // 相同的数字两两抵消，最后得出两个只出现过一次的数字
            if ((num & m) != 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        return new int[]{num1, num2};
    }
}
