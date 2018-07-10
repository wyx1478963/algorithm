package interview.search;

public interface Search {
    /**
     * T must overwrite equals
     * @param <T>
     * @param array
     * @param target
     */
    <T extends Comparable<T>> int search(T[] array, T target);
}
