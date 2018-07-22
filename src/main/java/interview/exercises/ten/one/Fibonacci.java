package interview.exercises.ten.one;

/**
 * 求菲波那契数列的第 n 项，n <= 39。
 */
public class Fibonacci {

    /**
     * 递归计算
     *
     * @param n
     * @return
     */
    public static int calFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calFibonacci(n - 1) + calFibonacci(n - 2);
        }
    }


    /**
     * 避免重复计算
     *
     * @param n
     * @return
     */
    public static int calFibonacci2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }

    /**
     * O(1)空间复杂度
     *
     * @param n
     * @return
     */
    public static int calFibonacci3(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int result = 0;
        int n_1 = 1;
        int n_2 = 0;
        for (int i = 2; i < n + 1; i++) {
            result = n_1 + n_2;
            n_2 = n_1;
            n_1 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calFibonacci(5));
        System.out.println(calFibonacci2(5));
        System.out.println(calFibonacci3(5));
    }
}
