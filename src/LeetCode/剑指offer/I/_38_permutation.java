package LeetCode.剑指offer.I;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 字符串的排列
 *
 * @author xoke
 * @date 2022/9/29
 */
public class _38_permutation {
    /**
     * 执行用时：9 ms, 在所有 Java 提交中击败了74.45%的用户
     * 内存消耗：46 MB, 在所有 Java 提交中击败了75.33%的用户
     */
    public String[] permutation(String s) {
        int len = s.length();
        // 是否访问过，不能访问同一元素
        boolean[] vis = new boolean[len];
        List<String> list = new ArrayList<>();
        char[] arr = s.toCharArray();
        // 按字母顺序排序，进行递归
        Arrays.sort(arr);
        // 递归中，得出的字符串
        StringBuilder str = new StringBuilder();
        // 递归
        dfs(arr, 0, len, vis, list, str);
        // 进行拼接字符串数组
        int size = list.size();
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public void dfs(char[] arr, int index, int len, boolean[] vis, List<String> list, StringBuilder temp) {
        // 到底，直接添加此时的临时字符串
        if (index == len) {
            list.add(temp.toString());
            return;
        }
        // 从不同位置的字符开始递归
        for (int i = 0; i < len; i++) {
            // 不能访问已经访问过的字符，
            if (vis[i] || (i > 0 && !vis[i - 1] && arr[i - 1] == arr[i])) {
                continue;
            }
            // 标记当前位置被访问
            vis[i] = true;
            // 将当前字符加进临时字符串中
            temp.append(arr[i]);
            // 继续递归
            dfs(arr, index + 1, len, vis, list, temp);
            // 将当前字符删除
            temp.deleteCharAt(temp.length() - 1);
            // 将当前位置还原为未访问过
            vis[i] = false;
        }
    }
}
