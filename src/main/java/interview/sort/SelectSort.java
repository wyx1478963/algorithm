package interview.sort;

import java.util.ArrayList;
import java.util.List;

public class SelectSort implements Sortable {

    @Override
    public <T extends Comparable<T>> void sort(T[] array, int order) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            T min = array[i];
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (min.compareTo(array[j]) > 0) {
                    min = array[j];
                    minIndex = j;
                }
            }
            array[minIndex] = array[i];
            list.add(min);
        }
        list.toArray(array);
    }
}
