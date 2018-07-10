package interview.search;

public class SearchMain {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 3, 3, 3, 4, 5, 6, 7, 8, 9, 12};

        System.out.println(new BinarySearch().searchMin(array, 3, 0, array.length-1));

//        for (int num : array) {
//            int index = new BinarySearch().searchMin(array, num,0,array.length);
//            if (index != -1) {
//                System.out.println(index);
//                System.out.println(array[index]);
//                assert num == array[index];
//            }
//        }

    }

}
