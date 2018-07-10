package interview.exercises.three;

/**
 * 数组中重复的数字,(0-n-1) O(n)+O(1)
 */
public class DuplicateNumber {

    public static int findDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            while (array[i] != i) {
                if (array[array[i]] == array[i]) {
                    return array[i];
                }
                swap(array, array[i], array[array[i]]);
                //wrong!!!
//                int temp = array[i];
//                array[i] = array[array[i]];
//                array[array[i]] = temp;
            }
        }
        return -1;
    }

    /**
     * 交换
     *
     * @param array
     * @param src
     * @param dest
     */
    public static void swap(int[] array, int src, int dest) {
        int temp = array[src];
        array[src] = array[dest];
        array[dest] = temp;
    }


    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 1, 0, 2, 5};
        System.out.println(findDuplicate(array));
    }
}
