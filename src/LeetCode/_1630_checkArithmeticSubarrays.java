package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1630_checkArithmeticSubarrays {
    /**
     * 执行用时：17 ms, 在所有 Java 提交中击败了76.87%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了79.67%的用户
     */
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        int m = l.length;
        for (int i = 0; i < m; i++) {
            // 按l和r中的左右两边界重新复制一个数组进行操作
            int[] arr = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            // 首先进行排序
            Arrays.sort(arr);
            // 设置默认公差
            int difference = arr[1] - arr[0];
            // 先默认为true
            boolean flag = true;
            for (int j = 0; j < r[i] - l[i]; j++) {
                // 只要相邻两元素的差值不为默认公差
                if (arr[j + 1] - arr[j] != difference) {
                    // 更新为false
                    flag = false;
                    // 并退出循环
                    break;
                }
            }
            // 将flag添加进list列表中
            list.add(flag);
        }
        // 返回列表
        return list;
    }
}
