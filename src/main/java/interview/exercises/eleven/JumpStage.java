package interview.exercises.eleven;

import org.junit.Test;

/**
 * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */

public class JumpStage {
    /**
     * 递归
     *
     * @param n
     * @return
     */
    public static int methodNum(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        return methodNum(n - 2) + methodNum(n - 1);
    }

    /**
     * 动态规划法
     *
     * @param n
     */
    public static int methodNum2(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(JumpFloor1(3) == methodNum(3));
        System.out.println(JumpFloor1(12) == methodNum2(12));
//        System.out.println(JumpFloor1(0) == methodNum(0));
        System.out.println(JumpFloor1(1) == methodNum(1));
    }


    public static int JumpFloor1(int n) {
        if (n == 1)
            return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n - 1];
    }

    public static int JumpFloor2(int n) {
        if (n <= 1)
            return n;
        int pre2 = 0, pre1 = 1;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }
}
