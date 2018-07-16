package interview.exercises.five;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为 We Are Happy. 则经过替换之后的字符串为 We%20Are%20Happy
 * 1.新建一个char[] 从左往右读取，写入除空格外的其他字符串，遇到空格写入%20三个字符
 * 2.先为空格替换的字符预留位置，然后倒序移动字符（一次确定字符的最终位置，避免多次移动）
 */
public class ReplaceSpace {

    public static String replace(String str) {
        if (str == null) {
            return null;
        }
        int oldLen = str.length();

        StringBuilder strBuilder = new StringBuilder(str);
        for (int i = 0; i < oldLen; i++) {
            if (strBuilder.charAt(i) == ' ') {
                strBuilder.append("  ");
            }
        }

        str = strBuilder.toString();
        int p1 = oldLen - 1;
        int p2 = str.length() - 1;
        char[] chars = str.toCharArray();
        while (p1 >= 0 && p1 <= p2) {
            if (chars[p1] == ' ') {
                chars[p2 - 2] = '%';
                chars[p2 - 1] = '2';
                chars[p2] = '0';
                p2 -= 3;
                p1--;
            } else {
                chars[p2] = chars[p1];
                p1--;
                p2--;
            }
        }

        return new String(chars);

    }

    public static void main(String[] args) {
        System.out.println(replace(" We Are Happy "));
        System.out.println(replace(""));
    }
}
