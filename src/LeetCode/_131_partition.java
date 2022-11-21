package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 分割回文串
 *
 * @author xoke
 * @date 2022/11/21
 */
public class _131_partition {
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了99.19%的用户
     * 内存消耗：53.2 MB, 在所有 Java 提交中击败了93.18%的用户
     */
    List<List<String>> list = new ArrayList<>();
    List<String> temp = new ArrayList<>();

    public List<List<String>> partition(String s) {
        char[] arr = s.toCharArray();
        backing(s, arr, 0);
        return list;
    }

    public void backing(String s, char[] arr, int index) {
        if (index == arr.length) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            if (check(arr, index, i)) {
                temp.add(s.substring(index, i + 1));
            } else {
                continue;
            }
            backing(s, arr, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public boolean check(char[] arr, int left, int right) {
        for (int i = left, j = right; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
