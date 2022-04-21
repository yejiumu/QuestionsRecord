package LeetCode;

/**
 * 山羊拉丁文
 */
public class _824_toGoatLatin {
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了31.07%的用户
     * 内存消耗：40.2 MB, 在所有 Java 提交中击败了24.07%的用户
     */
    public String toGoatLatin(String S) {
        String[] str = S.split(" ");
        // 依旧是string三兄弟中最快的
        StringBuilder ans = new StringBuilder();
        // 将元音字母先提前准备好
        String vowel = "aeiouAEIOU";
        int len = str.length;
        // 遍历每个单词
        for (int i = 0; i < len; i++) {
            // 判断首字母是否在vowel字符串中
            // 在，在后面添加“ma”，然后添加进ans中
            // 不在，从第二位截取原字符串再加上首字母再加上“ma”，然后添加进ans中
            ans.append(vowel.indexOf(str[i].charAt(0)) == -1 ?
                    str[i].substring(1) + str[0].charAt(0) + "ma" : str[i] + "ma");
            // 添加当前字符串所在位置个“a”
            for (int j = 0; j < i + 1; j++) {
                ans.append("a");
            }
            // 添加空格进行间隔
            ans.append(" ");
        }
        // 转换成字符串形式
        return ans.toString().trim();
    }
}
