package interview.sort;

public class BubbleSort implements Sortable {

    @Override
    public <T extends Comparable<T>> void sort(T[] array, int order) {
        if (order == 1) {
            for (int i = array.length - 1; i >= 0; i--) {
                boolean exchange = true;
                for (int j = 0; j < i; j++) {
                    if (array[j].compareTo(array[j + 1]) > 0) {
                        T tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                        exchange = false;
                    }

                }
                if (exchange) {
                    break;
                }
            }
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j].compareTo(array[j + 1]) < 0) {
                        T tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                    }
                }
            }
        }
    }
}
