package LeetCode;

/**
 * 第一个错误的版本
 */
public class _278_firstBadVersion extends VersionControl {
    /**
     * 执行用时：11 ms, 在所有 Java 提交中击败了99.95%的用户
     * 内存消耗：37.9 MB, 在所有 Java 提交中击败了45.33%的用户
     */
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        //循环直至端点相同
        while (left < right) {
            // 防止计算时溢出
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                //答案在区间[left, mid]
                right = mid;
            } else {
                //答案在区间[mid + 1, right]
                left = mid + 1;
            }
        }
        // 此时有 left == right，区间缩为一个点，即为答案
        return left;
    }
}

class VersionControl {
    boolean isBadVersion(int version) {
        //乱写的，题目要求
        return true;
    }
}
