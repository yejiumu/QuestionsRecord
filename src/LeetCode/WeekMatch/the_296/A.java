package LeetCode.WeekMatch.the_296;

public class A {
    public int minMaxGame(int[] nums) {
        int[] ans = loop(nums);
        return ans[0];
    }

    public int[] loop(int[] nums) {
        int len = nums.length;
        if (len > 1) {
            int[] arr = new int[len / 2];
            for (int i = 0; i < len / 2; i++) {
                if (i % 2 == 0) {
                    arr[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else {
                    arr[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            return loop(arr);
        }else{
            return nums;
        }
    }
}