package LeetCode;

/**
 * 交替位二进制数
 */
public class _693_hasAlternatingBits {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了17.60%的用户
     *
     * 这个很简单，用一个临时变量保存上一个最后的数值即可，然后进行比较
     */
//    public boolean hasAlternatingBits(int n) {
//        int temp = n % 2 == 0 ? 1 : 0;
//        while (n != 0) {
//            int cur = n % 2;
//            if (cur == temp) {
//                return false;
//            }
//            temp = cur;
//            n >>= 1;
//        }
//        return true;
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了45.87%的用户
     * <p>
     * 这个就很妙，因为是10101...这样的结构，所以可以移位后进行异或操作
     * 如果是符合条件的，结果一定是1111...，所以对其进行加一(全为 0)，然后进行并操作
     * 符合条件的语句为(111... & 000...)是否为零
     */
    public boolean hasAlternatingBits(int n) {
        int a = n ^ (n >> 1);
        return (a & (a + 1)) == 0;
    }
}
