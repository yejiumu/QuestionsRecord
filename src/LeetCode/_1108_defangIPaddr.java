package LeetCode;

/**
 * IP 地址无效化
 */
public class _1108_defangIPaddr {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.8 MB, 在所有 Java 提交中击败了5.21%的用户
     */
    public String defangIPaddr_(String address) {
        return address.replace(".", "[.]");
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.7 MB, 在所有 Java 提交中击败了20.88%的用户
     */
    public String defangIPaddr(String address) {
        // 直接进行拼接替换
        StringBuilder str = new StringBuilder();
        for (char ch : address.toCharArray()) {
            if (ch == '.') {
                str.append("[.]");
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }
}
