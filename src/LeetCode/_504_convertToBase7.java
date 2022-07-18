package LeetCode;

public class _504_convertToBase7 {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.2 MB, 在所有 Java 提交中击败了20.93%的用户
     */
    public String convertToBase7(int num) {
        StringBuilder str = new StringBuilder();
        // 判负，如果是负数，转化为正数进行操作
        boolean flag = false;
        if (num < 0) {
            flag = true;
            num = -num;
        }
        // 进行循环取余、除以7的操作
        while (num >= 7) {
            int temp = num % 7;
            // 将余数添加进行字符串中
            str.append(temp);
            num /= 7;
        }
        str.append(num);
        if (flag) {
            // 如果当初是负数，加上负号
            str.append("-");
        }
        // 反转字符串
        return str.reverse().toString();
    }
}
