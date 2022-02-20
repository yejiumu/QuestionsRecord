package LeetCode;

import java.util.Arrays;

/**
 * 最短补全词
 */
public class _748_shortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        int[] arr = new int[26];
        int sum = 0;
        for (char ch : licensePlate.toLowerCase().toCharArray()) {
            if (Character.isLowerCase(ch)) {
                arr[ch - 'a']++;
                sum++;
            }
        }
        for (String s : words) {
            int[] arr_ = Arrays.copyOf(arr, arr.length);
            int sum_ = 0;
            char[] chs = s.toCharArray();
            for (char ch : chs) {
                if (arr_[ch - 'a'] > 0) {
                    arr_[ch - 'a']--;
                    sum_++;
                }
                if (sum_ == sum)
                    return s;
            }
        }
        return "";
    }
}
