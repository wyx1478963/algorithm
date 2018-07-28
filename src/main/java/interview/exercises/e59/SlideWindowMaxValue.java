package interview.exercises.e59;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组 {2, 3, 4, 2, 6, 2, 5, 1} 及滑动窗口的大小 3，
 * 那么一共存在 6 个滑动窗口，他们的最大值分别为 {4, 4, 6, 6, 6, 5}。
 */
public class SlideWindowMaxValue {
    public static List<Integer> maxInWindows(int[] num, int size) {
        List<Integer> ret = new ArrayList<>();
        if (size > num.length || size < 1)
            return ret;
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);  /* 大顶堆 */
        for (int i = 0; i < num.length; i++) {
            heap.add(num[i]);
            if (heap.size() > size) {
                heap.remove(num[i - size]);
            }
            if (heap.size() == size) {
                ret.add(heap.peek());
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 4, 2, 6, 2, 5, 1};
        System.out.println(maxInWindows(array,3));
    }
}
