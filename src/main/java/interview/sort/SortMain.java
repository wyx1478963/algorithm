package interview.sort;

import java.util.Arrays;

public class SortMain {
    private static Sortable bubbleSort = new BubbleSort();

    private static Sortable insertSort = new InsertSort();

    private static Sortable selectSort = new SelectSort();

    private static Sortable quickSort = new QuickSort();

    private static Sortable heapSort = new HeapSort();

    private static Sortable mergeSort = new MergeSort();

    private static Sortable radixSort = new RadixSort();

    public static void main(String[] args) {
        Integer[] array = new Integer[]{9, 2, 3, 6, 4, 8, 2, 4, 5};
        int[] intArray = new int[]{92, 213, 3, 6, 4, 8, 2, 4, 5};
//        bubbleSort.sort(array,1);
//        insertSort.sort(array,1);
//        selectSort.sort(array,1);
//        quickSort.sort(array, 1);
//        heapSort.sort(array, 1);
//        MergeSort.sort(intArray,0,intArray.length - 1);
//        MergeSort.sortV2(intArray,0,intArray.length-1);
        radixSort.intSort(intArray);
        System.out.println(Arrays.toString(intArray));
//        System.out.println(Arrays.toString(array));
    }
}
