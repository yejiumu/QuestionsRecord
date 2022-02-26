package LeetCode;

/**
 * 移动零
 */
public class _283_moveZeroes {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.3 MB, 在所有 Java 提交中击败了29.23%的用户
     *
     * 这个是盗版的，复制零：遍历数组，计算0的个数，并在数组的零的个数的位置以后进行遍历赋值
     */
//    public void moveZeroes(int[] nums) {
//        if (nums.length == 0 || nums.length == 1) {
//            return;
//        }
//        int index = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[index] = nums[i];
//                index++;
//            }
//        }
//        for (int i = index; i < nums.length; i++) {
//            nums[i] = 0;
//        }
//    }
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.4 MB, 在所有 Java 提交中击败了26.41%的用户
     * <p>
     * 这个是正版的“移动”零
     */
    public void moveZeroes(int[] nums) {
        //如果数组为空或者长度为1，直接return，不用再进行下面操作
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        //设置左右指针位置
        int left = 0, right = 0;
        //限制循环条件
        while (right < nums.length) {
            //判断right指向是否为零
            if (nums[right] != 0) {
                //如果不为零，则交换left和right指向的元素
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                //并且left右移，指向下一个元素
                left++;
            }
            //执行交换后right也右移，指向下一个不确定的数，然后再进入循环，进行判断
            right++;
            //细心点可以发现，如果有连续的非零数，left和right会一起右移，只要碰到0，left就会停下，
            //而right继续右移，并找到非零数进行交换
        }
    }


}
