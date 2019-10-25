package free.fgq.demo.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * BigDecimal计算工具类
 */
public class BigDecimalUtil {

    private static final String PERCENT_PATTERN = "0%";
    private static final String PERCENT_PATTERN2 = "0.00%";

    /**
     * 获取百分比（count-lastCount）/count
     *
     * @param count
     * @param lastCount
     * @return
     */
    public static String getCountRatio(Integer count, Integer lastCount) {
        if (count == 0) {
            return percentFormat(dealZeroDecimal(lastCount));
        } else {
            return percentFormat(BigDecimal.valueOf(count - lastCount).divide(BigDecimal.valueOf(count), 2, BigDecimal.ROUND_HALF_UP).doubleValue());
        }
    }


    /**
     * 获取百分比count/totalCount
     *
     * @param count 除数
     * @param totalCount  被除数
     * @return
     */
    public static String getRatio(Integer count, Integer totalCount) {
        if (count == 0) {
            return percentFormat2(dealZeroDecimal(count));
        } else {
            return percentFormat2(BigDecimal.valueOf(count).divide(BigDecimal.valueOf(totalCount), 3, BigDecimal.ROUND_HALF_UP).doubleValue());
        }
    }

    public static void main(String[] args) {
        System.out.println(getRatio(1, 3));

    }


    /**
     * 本月/本周统计为0时，计算比例
     *
     * @param lastCount
     * @return
     */
    private static double dealZeroDecimal(long lastCount) {
        double ratio;
        if (lastCount == 0) {
            ratio = BigDecimal.ZERO.doubleValue();
        } else {
            ratio = BigDecimal.valueOf(-1).doubleValue();
        }
        return ratio;
    }

    /**
     * 格式化 0%
     * @return
     */
    public static String percentFormat2(double value) {
        DecimalFormat myFormat = new DecimalFormat(PERCENT_PATTERN2);
        return myFormat.format(value);
    }

    /**
     * 格式化百分比 0.00%
     * @return
     */
    public static String percentFormat(double value) {
        DecimalFormat myFormat = new DecimalFormat(PERCENT_PATTERN);
        return myFormat.format(value);
    }

    /**
     * 精确除法
     *
     * @param scale 精度
     */
    public static double div(int value1, int value2, int scale) {
        BigDecimal b1 = new BigDecimal(value1);
        BigDecimal b2 = new BigDecimal(value2);
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

}
