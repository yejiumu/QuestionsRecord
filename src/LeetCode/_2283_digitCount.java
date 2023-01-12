package LeetCode;

/**
 * 判断一个数的数字计数是否等于数位的值
 *
 * @author xoke
 * @date 2023/1/12
 */
public class _2283_digitCount {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.9 MB, 在所有 Java 提交中击败了58.16%的用户
     */
    public boolean digitCount(String num) {
        int[] nums = new int[10];
        for (char ch : num.toCharArray()) {
            nums[ch - '0']++;
        }
        int index = 0;
        for (char ch : num.toCharArray()) {
            if (ch - '0' != nums[index++]) {
                return false;
            }
        }
        return true;
    }
}
