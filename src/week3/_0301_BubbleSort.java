package week3;

import java.util.Arrays;

public class _0301_BubbleSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[] {4, 6, 2, 9, 1})));
        System.out.println(Arrays.toString(bubbleSort(new int[] {3, -1, 17, 9})));
        System.out.println(Arrays.toString(bubbleSort(new int[] {100, 56, -3, 32, 44})));
    }

    public static int[] bubbleSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) { // 앞 숫자가 더 크면 swap하기
                    int temp;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}
