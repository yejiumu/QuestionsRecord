package LeetCode.剑指offer.I;

/**
 * @author jiumu
 * @date 2023/2/14
 */
public class _66_constructArr {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：51.9 MB, 在所有 Java 提交中击败了64.69%的用户
     */
    public int[] constructArr_(int[] a) {
        int len = a.length;
        if (len <= 1) {
            return a;
        }
        // L[i] 代表的是 i 左侧所有数字的乘积
        int[] L = new int[len];
        // R[i] 代表的是 i 右侧所有数字的乘积
        int[] R = new int[len];
        int[] res = new int[len];
        // L[0] 应该是 1，因为第一个元素的左边没有元素。对于其他元素：L[i] = L[i-1] * a[i-1]
        L[0] = 1;
        for (int i = 1; i < len; i++) {
            L[i] = L[i - 1] * a[i - 1];
        }
        // R[len-1] 应为 1，其他元素：R[i] = R[i+1] * a[i+1]
        R[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            R[i] = R[i + 1] * a[i + 1];
        }
        for (int i = 0; i < len; i++) {
            res[i] = L[i] * R[i];
        }
        return res;
    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：52.5 MB, 在所有 Java 提交中击败了34.40%的用户
     */
    public int[] constructArr(int[] a) {
        int len = a.length;
        if (len <= 1) {
            return a;
        }
        int[] res = new int[len];
        // res[i] 表示索引 i 左侧所有元素的乘积
        // 因为索引为 '0' 的元素左侧没有元素， 所以 res[0] = 1
        res[0] = 1;
        for (int i = 1; i < len; i++) {
            res[i] = a[i - 1] * res[i - 1];
        }

        // R 为右侧所有元素的乘积
        // 刚开始右边没有元素，所以 R = 1
        int R = 1;
        for (int i = len - 1; i >= 0; i--) {
            // 对于索引 i，左边的乘积为 res[i]，右边的乘积为 R
            res[i] = res[i] * R;
            // R 需要包含右边所有的乘积，所以计算下一个结果时需要将当前值乘到 R 上
            R *= a[i];
        }
        return res;
    }
}
