package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 找到所有数组中消失的数字
 *
 * @author xoke
 * @date 2022/9/22
 */
public class _448_findDisappearedNumbers {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了99.58%的用户
     * 内存消耗：49.4 MB, 在所有 Java 提交中击败了53.87%的用户
     */
    public List<Integer> findDisappearedNumbers_(int[] nums) {
        // 此方法空间为 O(N)
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        int[] arr = new int[len];
        // 直接统计数量
        for (int num : nums) {
            arr[num - 1]--;
        }
        for (int i = 0; i < len; i++) {
            // 数量不变的就是没有的
            if (arr[i] == 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了99.58%的用户
     * 内存消耗：49.6 MB, 在所有 Java 提交中击败了33.60%的用户
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // 无额外空间操作
        int len = nums.length;
        for (int num : nums) {
            // 有可能当前 num已经加过 len，所以要进行取余
            int x = (num - 1) % len;
            // 在对应位上加上 len
            nums[x] += len;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            // 没有加上 len(即<=len)，就是没有出现过的数字
            if (nums[i] <= len) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
