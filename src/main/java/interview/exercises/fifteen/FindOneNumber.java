package interview.exercises.fifteen;

/**
 * 二进制中 1 的个数
 */
public class FindOneNumber {
    public static int countOneNumber(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n-1);
            count ++;
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(countOneNumber(-10));
    }
}
