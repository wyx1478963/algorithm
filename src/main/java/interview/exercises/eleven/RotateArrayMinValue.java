package interview.exercises.eleven;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个非递减排序的数组的一个旋转，
 * 输出旋转数组的最小元素。例如数组 {3, 4, 5, 1, 2} 为 {1, 2, 3, 4, 5} 的一个旋转，该数组的最小值为 1。
 * NOTE：给出的所有元素都大于 0，若数组大小为 0，请返回 0
 *
 */
public class RotateArrayMinValue {


    public static int findMinValue(int[] array, int start, int end) {
        if (start == end) {
            return array[start];
        }
        int mid = (start + end) / 2;
        if (array[mid] < array[end]) {
            return findMinValue(array, start, mid);
        } else {
            return findMinValue(array, mid + 1, end);
        }

    }

    public static void main(String[] args) {
        int[] testArray = new int[]{3, 3, 3, 3, 4, 5, 1, 2};
        System.out.println(findMinValue(testArray, 0, testArray.length - 1));
    }

}
