package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xoke
 * @date 2022/11/10
 */
public class _754_reachNumber {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了84.79%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了85.52%的用户
     */
    public int reachNumber(int target) {
        // target可能为负数，这里进行取正处理（对称性，所以正负都无所谓）
        List<Integer> list = new ArrayList<>();
        int sum = 0, tar = Math.abs(target), count = 0;
        while (sum < tar || (sum - tar) % 2 != 0) {
            sum += ++count;
        }
        return count;
    }
}
