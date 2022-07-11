package LeetCode;

public class _476_findComplement {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.5 MB, 在所有 Java 提交中击败了34.49%的用户
     */
    public int findComplement(int num) {
        // 统计几位二进制，用这个二进制全为1进行异位运算
        int temp = num, c = 0;
        while (temp > 0) {
            temp >>= 1;
            c = (c << 1) + 1;
        }
        return num ^ c;
    }
}
