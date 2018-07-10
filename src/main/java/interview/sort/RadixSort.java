package interview.sort;

public class RadixSort implements Sortable {
    @Override
    public void intSort(int[] array) {
        int max = getMax(array);
        int bucketCount = 0;
        while (max != 0) {
            max /= 10;
            bucketCount++;
        }
        for (int i = 0; i < bucketCount; i++) {
            bucketSort(array, i);
        }
    }

    public void bucketSort(int[] array, int count) {
        int[] bucketArray = new int[10];

        for (int i = 0; i < array.length; i++) {
            bucketArray[array[i] / (int) Math.pow(10, count) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            bucketArray[i] = bucketArray[i] + bucketArray[i - 1];
        }
        int[] outputArray = new int[bucketArray.length];
        for (int i = array.length - 1;i >=0 ;i --) {
            outputArray[bucketArray[array[i] / (int) Math.pow(10, count) % 10]-1] = array[i];
            bucketArray[array[i] / (int) Math.pow(10, count) % 10]-=1;
        }
        System.arraycopy(outputArray,0,array,0,array.length);
    }

    public int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int anArray : array) {
            if (anArray > max) {
                max = anArray;
            }
        }
        return max;
    }
}
