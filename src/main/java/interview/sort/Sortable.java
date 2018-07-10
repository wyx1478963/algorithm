package interview.sort;

public interface Sortable {
    /**
     * sort the array ,return the reference
     *
     * @param array
     * @param order 1 order asc and -1 order desc
     * @param <T>
     */
    default <T extends Comparable<T>> void sort(T[] array, int order) {
    }


    default void intSort(int[] array) {
    }
}
