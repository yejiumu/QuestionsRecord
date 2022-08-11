package LeetCode.剑指offer.I;

/**
 * 替换空格
 *
 * @author xoke
 * @date 2022/8/11
 */
public class _5_replaceSpace {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.8 MB, 在所有 Java 提交中击败了7.53%的用户
     */
    public String replaceSpace_(String s) {
        // 直接调用API
        return s.replace(" ", "%20");
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了15.01%的用户
     */
    public String replaceSpace(String s) {
        int len = s.length();
        // 创建三倍长度的数组
        char[] arr = new char[len * 3];
        int size = 0;
        for (char ch : s.toCharArray()) {
            // 遍历，依次替换
            if (ch == ' ') {
                arr[size++] = '%';
                arr[size++] = '2';
                arr[size++] = '0';
            } else {
                arr[size++] = ch;
            }
        }
        // 转化为字符串
        return new String(arr, 0, size);
    }
}
