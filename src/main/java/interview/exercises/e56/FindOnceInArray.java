package interview.exercises.e56;

/**
 * 数组中只出现一次的数字
 */
public class FindOnceInArray {
    public static int findOnceNum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int diff = 0;
        for (int num : array) {
            if (diff == 0) {
                diff = num;
            } else {
                diff ^= num;
            }
        }
        return diff;
    }
        //todo: not right
    public static void FindNumsAppearOnce(int[] nums, int num1[], int num2[]) {
        int diff = 0;
        for (int num : nums)
            diff ^= num;
        diff &= -diff;
        for (int num : nums) {
            if ((num & diff) == 0)
                num1[0] ^= num;
            else
                num2[0] ^= num;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 2, 8, 1, 2, 4, 3};
//        System.out.println(findOnceNum(array));

        FindNumsAppearOnce(array, new int[1], new int[1]);
    }
}
