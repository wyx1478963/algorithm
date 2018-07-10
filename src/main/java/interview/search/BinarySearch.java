package interview.search;

public class BinarySearch implements Search {

    @Override
    public <T extends Comparable<T>> int search(T[] array, T target) {
        int arraySize = array.length;
        return search(array, target, 0, arraySize - 1);

    }

    private <T extends Comparable<T>> int search(T[] array, T target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        System.out.println("Current index : " + mid + " start:" + start + " end:" + end);
        if (array[mid].compareTo(target) == 0) {
            return mid;
        } else if (array[mid].compareTo(target) > 0) {
            return search(array, target, start, mid - 1);
        } else {
            return search(array, target, mid + 1, end);
        }
    }

    public <T extends Comparable<T>> int searchMin(T[] array, T target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        System.out.println("Current index : " + mid + " start:" + start + " end:" + end);
        if (array[mid].compareTo(target) == 0) {
            return findMin(array, target, mid);
        } else if (array[mid].compareTo(target) > 0) {
            return searchMin(array, target, start, mid - 1);
        } else {
            return searchMin(array, target, mid + 1, end);
        }
    }

    private <T extends Comparable<T>> int findMin(T[] array, T target, int firstFindIndex) {

        int firstIndexTemp = firstFindIndex;
        if (firstFindIndex > 0) {
            while (array[firstIndexTemp].equals(target)) {
                firstIndexTemp -= 1;
            }
            return firstIndexTemp + 1;
        } else {
            return firstFindIndex;
        }
    }
}
