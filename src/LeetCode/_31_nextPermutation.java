package LeetCode;

/**
 * 下一个排列
 *
 * @author xoke
 * @date 2023/1/6
 */
public class _31_nextPermutation {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了66.88%的用户
     */
    public void nextPermutation(int[] nums) {
        int len = nums.length, i = len - 2;
        // 从后往前找到第一个递增的相邻对
        // 此时可以保证i后都是递减
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = len - 1;
            // 从后往前找到第一个大于等于i的数值
            // 因为i后都是递减，所以找到第一个就是最接近i的数值
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            // 直接交换，完成变大操作
            swap(nums, i, j);
        }
        // 然后将递减序列翻转，i后的序列就变成最小了
        reverse(nums, i + 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // 因为有序，所以直接双指针交换即可
    public void reverse(int[] nums, int start) {
        int left = start, rigth = nums.length - 1;
        while (left < rigth) {
            swap(nums, left, rigth);
            left++;
            rigth--;
        }
    }
}
