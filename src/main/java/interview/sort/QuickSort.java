package interview.sort;

public class QuickSort implements Sortable {
    @Override
    public <T extends Comparable<T>> void sort(T[] array, int order) {
        sort(array,0,array.length - 1);
    }

    private <T extends Comparable<T>> void sort(T[] array, int start, int end) {
        int indexStart = start;
        int indexEnd = end;
        if (indexStart >= indexEnd) {
            return;
        }
        while (indexStart < indexEnd) {
            while (array[indexStart].compareTo(array[indexEnd]) <= 0 && indexStart < indexEnd) {
                indexEnd--;
            }
            T temp = array[indexEnd];
            array[indexEnd] = array[indexStart];
            array[indexStart] = temp;
            while (array[indexEnd].compareTo(array[indexStart]) >= 0 && indexStart < indexEnd) {
                indexStart++;
            }

        }
        T temp2 = array[indexStart];
        array[indexStart] = array[indexEnd];
        array[indexEnd] = temp2;

        sort(array, start, indexStart - 1);
        sort(array, indexStart + 1, end);

    }
}
