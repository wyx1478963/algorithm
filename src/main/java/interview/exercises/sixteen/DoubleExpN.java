package interview.exercises.sixteen;

/**
 * 给定一个 double 类型的浮点数 base 和 int 类型的整数 exponent。求 base 的 exponent 次方。
 */
public class DoubleExpN {

    public static double calDoubleN(double base, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp == 1) {
            return base;
        } else if (exp == 2) {
            return base * base;
        } else if (exp == -1) {
            return (double) 1 / base;
        } else if (exp == -2) {
            return (double) 1 / (base * base);
        } else {
            return calDoubleN(base, exp / 2) * calDoubleN(base, exp - exp / 2);
        }
    }

    public static double Power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        boolean isNegative = false;
        if (exponent < 0) {
            exponent = -exponent;
            isNegative = true;
        }
        double pow = Power(base * base, exponent / 2);
        if (exponent % 2 != 0)
            pow = pow * base;
        return isNegative ? 1 / pow : pow;
    }

    public static void main(String[] args) {
        double num1 = 1.4;
        int[] exps = {-6, -3, 3, 6};
        for (int exp : exps) {
            System.out.println(calDoubleN(num1, exp) == Power(num1, exp));
        }
    }
}
