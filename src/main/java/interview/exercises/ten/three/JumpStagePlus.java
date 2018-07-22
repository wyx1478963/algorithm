package interview.exercises.ten.three;

import java.util.Arrays;

/**
 * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
public class JumpStagePlus {

    public static long jumpStage(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int[] steps = new int[n + 1];
        steps[0] = 1;
        steps[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            steps[i] = 1;
            for (int j = 1; j < i; j++) {
                steps[i] += steps[j];
            }
        }


        return steps[n];
    }

    public static int JumpFloorII(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp, 1);
        for (int i = 1; i < target; i++)
            for (int j = 0; j < i; j++)
                dp[i] += dp[j];
        return dp[target - 1];
    }

    public static void main(String[] args) {
        System.out.println(jumpStage(10) == JumpFloorII(10));
    }


}
