package LeetCode;

public class _405_toHex {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.7 MB, 在所有 Java 提交中击败了56.88%的用户
     */
    public String toHex_(int num) {
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

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39 MB, 在所有 Java 提交中击败了21.72%的用户
     */
    public String toHex(int num) {
        // 特殊情况，0直接返回0
        if (num == 0) {
            return "0";
        }
        // 创建字符串拼接最快的
        StringBuilder ans = new StringBuilder();
        // 当num不为0时，进行循环
        while (num != 0) {
            // 拼接与上15的结果
            ans.append(code(num & 0xf));
            // 无符号右移4位，即除以16
            num >>>= 4;
        }
        return ans.reverse().toString();
    }

    public char code(int num) {
        if (num >= 10) {
            // 大于等于10转化为字母系列
            return (char) (num - 10 + 'a');
        }
        // 否则数字系列
        return (char) (num + '0');
    }
}
