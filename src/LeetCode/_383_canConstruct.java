package LeetCode;

/**
 * 赎金信
 */
public class _383_canConstruct {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.84%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了10.35%的用户
     */
//    public boolean canConstruct(String ransomNote, String magazine) {
//        char[] rArr = ransomNote.toCharArray();
//        char[] mArr = magazine.toCharArray();
//        int[] r = new int[26];
//        int[] m = new int[26];
//        for (char ch : rArr) {
//            r[ch - 'a']++;
//        }
//        for (char ch : mArr) {
//            m[ch - 'a']++;
//        }
//        int len = ransomNote.length();
//        for (int i = 0; i < len; i++) {
//            if (r[i] > m[i]) {
//                return false;
//            }
//        }
//        return true;
//    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.84%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了12.91%的用户
     * <p>
     * 感觉这个更妙一点，虽然好像和上面的差不多
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        //如果ran长度更长，直接返回false
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        //创建个数数组以及将字符串数组化
        int[] cnt = new int[26];
        char[] mArr = magazine.toCharArray();
        char[] rArr = ransomNote.toCharArray();
        //遍历mArr，将个数数组对应位置的数值加一
        for (char c : mArr) {
            cnt[c - 'a']++;
        }
        //遍历rArr，将个数数组对应位置的数值减一
        for (char c : rArr) {
            cnt[c - 'a']--;
            //判断减一后是否小于0，如果小于0说明无法在magazine中找到不大于的字母数量
            //然后直接返回false
            if (cnt[c - 'a'] < 0) {
                return false;
            }
        }
        //前面全部正确，直接返回true
        return true;
    }
}
