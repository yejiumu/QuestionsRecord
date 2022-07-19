package LeetCode;

public class _405_toHex {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.7 MB, 在所有 Java 提交中击败了56.88%的用户
     */
    public String toHex(int num) {
        // 如果为0，直接返回0
        if (num == 0) {
            return "0";
        }
        String[] arr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e"};
        StringBuilder str = new StringBuilder();
        while (num != 0) {
            // 位运算取余
            str.append(arr[num & 15]);
            // 无符号右移4位
            num >>>= 4;
        }
        return str.reverse().toString();
    }
}
