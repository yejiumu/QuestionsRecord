package LeetCode;

public class _1700_countStudents {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.4 MB, 在所有 Java 提交中击败了33.56%的用户
     */
    public int countStudents(int[] students, int[] sandwiches) {
        // 遍历统计各有多少0和1的学生
        // 因为学生可以随意变换位置，所以不用在乎顺序，只知道数量即可
        int[] count = new int[2];
        for (int num : students) {
            count[num]++;
        }
        int len = sandwiches.length;
        // 因为三明治是有顺序的，按顺序遍历三明治，并将相应的学生数量减一
        // 直到有一种学生的数量小于等于0，那么剩下的另一种学生全都不能满足条件
        // 返回len - i 即可
        for (int i = 0; i < len; i++) {
            if (count[sandwiches[i]] > 0) {
                count[sandwiches[i]]--;
            } else {
                return len - i;
            }
        }
        return 0;
    }
}
