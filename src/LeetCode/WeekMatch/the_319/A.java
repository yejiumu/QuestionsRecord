package LeetCode.WeekMatch.the_319;

/**
 * 温度转换
 *
 * @author xoke
 * @date 2022/11/13
 */
public class A {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
