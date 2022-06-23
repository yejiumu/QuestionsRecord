package LeetCode;

/**
 * 反转字符串中的元音字母
 */
public class _345_reverseVowels {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了70.37%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了21.96%的用户
     */
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int len = s.length();
        // 双指针左右遍历寻找元音字母
        int left = 0, right = len - 1;
        while (left < right) {
            // 右指针寻找元音字母
            while (left < len && !isVowel(arr[left])) {
                left++;
            }
            // 左指针寻找元音字母
            while (right > 0 && !isVowel(arr[right])) {
                right--;
            }
            if (left < right) {
                // 如果此时仍然右指针大，则进行交换
                swap(arr, left, right);
                // 两指针向中间靠拢
                left++;
                right--;
            }
        }
        // 返回即可
        return new String(arr);
    }

    // 判断是否为元音字母
    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }

    // 数组中交换两元素
    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
