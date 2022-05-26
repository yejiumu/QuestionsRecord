package LeetCode;

/**
 * 比较版本号
 */
public class _165_compareVersion {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了21.02%的用户
     */
    public int compareVersion(String version1, String version2) {
        int v1 = version1.length(), v2 = version2.length();
        int i = 0, j = 0;
        while (i < v1 || j < v2) {
            int x = 0;
            // 获取句号之间的数字
            for (; i < v1 && version1.charAt(i) != '.'; i++) {
                x = x * 10 + version1.charAt(i) - '0';
            }
            // 跳过句号
            ++i;
            int y = 0;
            // 获取句号之间的数字
            for (; j < v2 && version2.charAt(j) != '.'; j++) {
                y = y * 10 + version2.charAt(j) - '0';
            }
            // 跳过句号
            ++j;
            // 比较句号之间数字大小
            if (x != y) {
                return x > y ? 1 : -1;
            }
        }
        return 0;
    }
}
