package LeetCode;

/**
 * K 进制表示下的各位数字总和
 *
 * @author xoke
 * @date 2022/7/30
 */
public class _1837_sumBase {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了70.63%的用户
     */
    public int sumBase(int n, int k) {
        int sum = 0;
        // 当n不为0时，一直循环
        while (n != 0) {
            // 直接加上对k取余的结果
            sum += n % k;
            // 再将n除以k，进行进制转换
            n /= k;
        }
        return sum;
    }
}
