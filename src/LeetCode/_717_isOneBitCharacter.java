package LeetCode;

/**
 * 1比特与2比特字符
 */
public class _717_isOneBitCharacter {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * <p>
     * 内存消耗：40.7 MB, 在所有 Java 提交中击败了16.50%的用户
     * <p>
     * 从头开始遍历，遇到1后退两格，遇到0后退一格，遍历完后与[数组长度 - 1]比较大小
     */
    public boolean isOneBitCharacter(int[] bits) {
        int index = 0;
        while (index < bits.length - 1) {
            if (bits[index] == 1) {
                index +=2;
            }else{
                index++;
            }
        }
        return index == bits.length - 1;
    }
}
