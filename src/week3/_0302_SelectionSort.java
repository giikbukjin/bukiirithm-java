package week3;

import java.util.Arrays;

public class _0302_SelectionSort {
    public static void main(String[] args) {
        int[] input = {4, 6, 2, 9, 1};
        int[] result = selectionSort(input);
        System.out.println(Arrays.toString(result));
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) { // 4번 swap 해야 하니까 length - 1
            int minIndex = i;
            for (int j = 0; j < array.length - i; j++) { // 정렬 완료된 앞 요소가 하나씩 줄어드니 length - j
                if (array[i + j] < array[minIndex]) {
                    minIndex = i + j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }
}
