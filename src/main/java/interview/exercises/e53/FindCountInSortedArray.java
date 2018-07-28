package interview.exercises.e53;

/**
 * Input:
 * 1, 2, 3, 3, 3, 3, 4, 6
 * 3
 * Output:
 * 4
 */
public class FindCountInSortedArray {


    public static int binarySearchMinIndex(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        int low = 0;
        int high = length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                index = mid;
                while (index >= 0 && nums[index] == target) {
                    index--;
                }
                index++;
                return index;
            }
        }
        return index;
    }

    public static int countFromIndex(int[] nums, int index, int target) {
        if (index == -1) {
            return 0;
        }
        int count = 0;
        while (nums[index] == target) {
            index++;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 3, 3, 3, 4, 6};
        int index = binarySearchMinIndex(array,1);
        int count = countFromIndex(array,index,1);
        System.out.println(count);
    }
}
