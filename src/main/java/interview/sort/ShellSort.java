package interview.sort;

public class ShellSort implements Sortable {

    @Override
    public <T extends Comparable<T>> void sort(T[] array, int order) {
        int gap = array.length % 2 == 0?array.length/2:array.length/2 + 1;
        for (int i = gap;i >= 1;i --) {
            for (int j = 0;j + gap < array.length;j ++) {

            }
        }
    }
}
