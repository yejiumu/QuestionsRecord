package LeetCode;

/**
 * 反转单词前缀
 */
public class _2000_reversePrefix {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了22.60%的用户
     */
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index > 0) {
            char[] arr = word.toCharArray();
            int left = 0, right = index;
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            word = new String(arr);
        }
        return word;
    }
}
