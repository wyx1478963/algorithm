package interview.sort;

import java.util.LinkedList;
import java.util.List;

public class InsertSort implements Sortable {
    @Override
    public <T extends Comparable<T>> void sort(T[] array, int order) {
        List<T> list = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            T target = array[i];
            if (i == 0) {
                list.add(target);
            }
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).compareTo(target) > 0) {
                    list.add(j, target);
                    break;
                }
            }
        }

        list.toArray(array);
    }


}
