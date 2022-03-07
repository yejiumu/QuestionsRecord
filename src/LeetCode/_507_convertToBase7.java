package LeetCode;

/**
 * 七进制数
 */
public class _507_convertToBase7 {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.7 MB, 在所有 Java 提交中击败了30.07%的用户
     * <p>
     * 直接调用api太bug
     */
//    public String convertToBase7(int num) {
//        return Integer.toString(num, 7);
//    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了76.60%的用户
     * 内存消耗：38.7 MB, 在所有 Java 提交中击败了30.81%的用户
     */
    public String convertToBase7(int num) {
        //判断是否为负数
        boolean flag = num < 0;
        //如果是负数，取正数进行计算
        if (flag) {
            num = -num;
        }
        //创建string三兄弟中最快的
        StringBuilder res = new StringBuilder();
        //do while 是为了防止num一开始就等于零的情况
        //do while 一定会进行循环一次
        do {
            res.append(num % 7);
            num /= 7;
        } while (num != 0);
        //然后将res字符串反转
        res.reverse();
        //再进行判断是否为负数，如果是，加上符号
        return flag ? "-" + res : res.toString();
    }
}
