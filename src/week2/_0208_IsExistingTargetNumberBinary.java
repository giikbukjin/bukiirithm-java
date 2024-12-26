package week2;

public class _0208_IsExistingTargetNumberBinary {
    public static void main(String[] args) {
        int findingTarget = 14;
        int[] findingNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println(isExistingTargetNumberSequential(findingTarget, findingNumbers));
    }

    // 이진 탐색의 시간 복잡도는 O(logN)이다.
    public static boolean isExistingTargetNumberSequential(int target, int[] array) {
        int minIndex = 0;
        int maxIndex = array.length - 1;
        int halfIndex = (maxIndex + maxIndex) / 2; // 중간 값

        while (minIndex <= maxIndex) {
            if (array[halfIndex] == target) {
                return true;
            } else if (array[halfIndex] > target) {
                maxIndex = halfIndex - 1;
            } else {
                minIndex = halfIndex + 1;
            }
            halfIndex = (maxIndex + maxIndex) / 2;
        }
        return false;
    }
}