package LeetCode.CodeCarl.string;

/**
 * 替换空格
 *
 * @author xoke
 * @date 2022/10/31
 */
public class _offer_5_replaceSpace {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.3 MB, 在所有 Java 提交中击败了68.20%的用户
     */
//    public String replaceSpace(String s) {
//        return s.replace(" ", "%20");
//    }
    public String replaceSpace(String s) {
        int len = s.length(), index = 0;
        char[] arr = new char[len * 3];
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                arr[index++] = '%';
                arr[index++] = '2';
                arr[index++] = '0';
            } else {
                arr[index++] = ch;
            }
        }
        return new String(arr, 0, index);
    }
}
