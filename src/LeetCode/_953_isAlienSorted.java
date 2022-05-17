package LeetCode;

/**
 * 验证外星语词典
 */
public class _953_isAlienSorted {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了90.79%的用户
     */
    public boolean isAlienSorted(String[] words, String order) {
        // 把给定的字母表顺序排好序
        int[] index = new int[26];
        for (int i = 0; i < order.length(); i++) {
            index[order.charAt(i) - 'a'] = i;
        }
        // 遍历字符串数组，逐个比较
        search:
        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];
            // 前面的字符串长度不能大于后面的
            if (s1.length() > s2.length()) {
                return false;
            }
            // 遍历短者的字符串，并比较相应位置两字符串是否相等
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    // 如果前者大，直接返回false
                    if (index[s1.charAt(j) - 'a'] > index[s2.charAt(j) - 'a']) {
                        return false;
                    }
                    // 如果后者小，直接下一循环
                    continue search;
                }
            }
        }
        // 最后没有问题返回true
        return true;
    }
}
