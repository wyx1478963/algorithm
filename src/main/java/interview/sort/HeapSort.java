package interview.sort;

public class HeapSort implements Sortable {
    @Override
    public <T extends Comparable<T>> void sort(T[] array, int order) {
        for (int i = array.length - 1; i >= 0; i--) {
            int startIndex = (i + 1) / 2 - 1;
            while (startIndex >= 0) {
                shiftDown(array, startIndex, i + 1);
                startIndex --;
            }
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;
        }
    }

    private <T extends Comparable<T>> void shiftDown(T[] array, int index, int length) {
        int j = 2 * index + 1;
        if (j >= length) {
            return;
        }
        if (j + 1 < length) {
            if (array[j + 1].compareTo(array[j]) > 0) {
                T temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
        if (array[j].compareTo(array[index]) > 0) {
            T temp = array[j];
            array[j] = array[index];
            array[index] = temp;
            shiftDown(array, 2 * index + 1, length);
        }

    }
}
