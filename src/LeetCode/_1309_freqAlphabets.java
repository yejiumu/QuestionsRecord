package LeetCode;

/**
 * 解码字母到整数映射
 */
public class _1309_freqAlphabets {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了49.72%的用户
     */
    public String freqAlphabets(String s) {
        //创建String三兄弟中最快的
        StringBuilder str = new StringBuilder();
        //直接对s进行遍历
        for (int i = 0; i < s.length(); i++) {
            //如果当前位置的后两位的元素是’#’，并且没有越界，则直接进行计算，然后后移两位，然后添加到str中
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                str.append((char) ((s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '1') + 'a'));
                i += 2;
            } else {
                //如果不符合上述情况，直接进行计算，然后添加到str中
                str.append((char) (s.charAt(i) - '1' + 'a'));
            }
        }
        //返回str的字符串形式
        return str.toString();
    }
}
