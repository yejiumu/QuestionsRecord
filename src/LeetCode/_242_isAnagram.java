package LeetCode;

/**
 * 有效的字母异位词
 */
public class _242_isAnagram {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了66.27%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了29.77%的用户
     *
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
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了33.89%的用户
     */
    public boolean isAnagram(String s, String t) {
        //创建两个计数数组，0 - 25 为 a - z
        int[] sNum = new int[26];
        int[] tNum = new int[26];
        //将字符串转化为数组
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        //逐个遍历，统计个数
        for (char c : charS) {
            sNum[c - 'a']++;
        }
        for (char c : charT) {
            tNum[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            //如果ransomNote中的某一个字母的个数大于magazine，直接false
            if (sNum[i] != tNum[i]) {
                return false;
            }
        }
        return true;
    }
}
