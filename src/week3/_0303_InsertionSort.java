package week3;

import java.util.Arrays;

public class _0303_InsertionSort {
    public static void main(String[] args) {
        int[] array = {4, 6, 2, 9, 1};
        System.out.println(Arrays.toString(insertionSort(array)));
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i - j] < array[i - j - 1]) {
                    int temp = array[i - j];
                    array[i - j] = array[i - j - 1];
                    array[i - j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return array;
    }
}
