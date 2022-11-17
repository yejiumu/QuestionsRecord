package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 匹配子序列的单词数
 *
 * @author xoke
 * @date 2022/11/17
 */
public class _792_numMatchingSubseq {
    /**
     * 执行用时：146 ms, 在所有 Java 提交中击败了24.95%的用户
     * 内存消耗：49 MB, 在所有 Java 提交中击败了40.40%的用户
     */
    public int numMatchingSubseq(String s, String[] words) {
        List<Integer>[] list = new List[26];
        for (int i = 0; i < 26; i++) {
            list[i] = new ArrayList<>();
        }
        int len = s.length();
        for (int i = 0; i < len; i++) {
            list[s.charAt(i) - 'a'].add(i);
        }
        int res = words.length;
        for (String word : words) {
            if (word.length() > len) {
                res--;
                continue;
            }
            int p = -1;
            for (char ch : word.toCharArray()) {
                if (list[ch - 'a'].isEmpty() ||
                        list[ch - 'a'].get(list[ch - 'a'].size() - 1) <= p) {
                    --res;
                    break;
                }
                p = binarySearch(list[ch - 'a'], p);
            }
        }
        return res;
    }

    public int binarySearch(List<Integer> list, int target) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return list.get(left);
    }
}
