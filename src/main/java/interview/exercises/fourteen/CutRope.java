package interview.exercises.fourteen;

/**
 * 把一根绳子剪成多段，并且使得每段的长度乘积最大。
 * <p>
 * For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).
 */
public class CutRope {

    public static int findMax(int ropeLength) {
        // todo: 异常值
        if (ropeLength == 1) {
            return 1;
        }
        if (ropeLength == 2) {
            return 1;
        }
        int[] dp = new int[ropeLength + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < ropeLength + 1; i++) {
            dp[i] = i;
            int max = 0;
            for (int j = 0; j <= i/2; j ++) {
                max = Math.max(dp[j]*dp[i-j],max);
            }
            dp[i] = max;
        }
        return dp[ropeLength];
    }

    public static int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            for (int j = 1; j < i; j++)
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[j] * (i - j)));
        return dp[n];
    }


    public static void main(String[] args) {
        System.out.println(findMax(20) == integerBreak(20));
    }
}
