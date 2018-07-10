package interview.sort;

public class MergeSort implements Sortable {
    @Override
    public <T extends Comparable<T>> void sort(T[] array, int order) {
        T[] storeArray = array.clone();

    }

    public static int[] sort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(a, low, mid);
            sort(a, mid + 1, high);
            //左右归并
            System.out.println("start merge : " + low + " , " + mid + " , " + high);
            merge(a, low, mid, high);
        }
        return a;
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int x = 0; x < temp.length; x++) {
            a[x + low] = temp[x];
        }
    }


    public static void sortV2(int[] array, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sortV2(array, low, mid);
            sortV2(array, mid + 1, high);
            mergeV2(array, low, mid, high);
        }

    }

    private static void mergeV2(int[] array, int low, int mid, int high) {
        int[] tempArray = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                tempArray[k++] = array[i++];
            } else {
                tempArray[k++] = array[j++];
            }
        }
        while (i <= mid) {
            tempArray[k++] = array[i++];
        }
        while (j <= high) {
            tempArray[k++] = array[j++];
        }

        System.arraycopy(tempArray, 0, array, low, high - low + 1);

    }


}
