package interview.exercises.e58;

/**
 * 输入："I am a student."
 * <p>
 * 输出："student. a am I"
 */
public class RotateWord {

    public static String ReverseSentence(String str) {
        int n = str.length();
        char[] chars = str.toCharArray();
        int wordStart = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ' || i == chars.length -1) {
                reverse(chars, wordStart, i - 1);
                wordStart = i + 1;
            }
        }
        reverse(chars,0,n-1);
        return new String(chars);
    }

    private static void reverse(char[] c, int i, int j) {
        while (i < j)
            swap(c, i++, j--);
    }

    private static void swap(char[] c, int i, int j) {
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
    }

    public static void main(String[] args) {
        System.out.println(ReverseSentence(" I am a student."));
    }
}
