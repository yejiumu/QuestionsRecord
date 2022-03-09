package LeetCode;

/**
 * 有效的字母异位词
 */
@SuppressWarnings("all")
public class _242_isAnagram {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了66.27%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了29.77%的用户
     * <p>
     * 调用太多s.charAt(i)，消耗太多时间
     */
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        int len = s.length();
//        int[] ss = new int[26];
//        int[] tt = new int[26];
//        for (int i = 0; i < len; i++) {
//            ss[s.charAt(i) - 'a']++;
//            tt[t.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < 26; i++) {
//            if (ss[i] != tt[i]) {
//                return false;
//            }
//        }
//        return true;
//    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了14.11%的用户
     */
    public boolean isAnagram(String s, String t) {
        //如果两个字符串的长度不相等，直接返回false
        if (s.length() != t.length()) {
            return false;
        }
        //创建个数数组以及将字符串数组化
        int[] count = new int[26];
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        //遍历sArr，将个数数组对应位置的数值加一
        for (char ch : sArr) {
            count[ch - 'a']++;
        }
        //遍历tArr，将个数数组对应位置的数值减一
        for (char ch : tArr) {
            count[ch - 'a']--;
            //判断减一后是否小于0，如果小于0说明无法在magazine中找到不大于的字母数量
            //然后直接返回false
            if (count[ch - 'a'] < 0) {
                return false;
            }
        }
        //前面全部正确，直接返回true
        return true;
    }
}
