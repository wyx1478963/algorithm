package interview.exercises.e46;

/**
 * 给定一个数字，按照如下规则翻译成字符串：0 翻译成“a”，1 翻译成“b”... 25 翻译成“z”。
 * 一个数字有多种翻译可能，例如 12258 一共有 5 种，分别是 bccfi，bwfi，bczi，mcfi，mzi。
 * 实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 */
public class TranslateDigit {

    public static int translate(String  s) {
        if (s == null || s.length() == 0)
            return 0;
        int numLength = s.length();
        int[] dp = new int[numLength+ 1];
        dp[0] = 1;
        dp[1] =1;
        for (int i = 2; i<= numLength; i++) {
            int twoNum = Integer.parseInt(s.substring(i-2,i));
            if (twoNum > 25 || twoNum < 10){
                dp[i] = dp[i-1];
            }else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[numLength];
    }



    public static void main(String[] args) {
        System.out.println(translate("12258"));
    }
}
