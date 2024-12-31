package week2;

import java.util.ArrayList;

public class _0216_GetCountDoingPlusMinus {
    public static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        // 배열의 0번쨰 인덱스부터 시작해서, 다음 수를 더하거나/빼는 분기로 나누는 재귀함수 실행
        int[] numbers = {1, 1, 1, 1, 1};
        int targetNumber = 3;

        System.out.println(getCount(numbers, targetNumber));
    }

    public static int getCount(int[] array, int target) {
        int targetCount = 0;

        getAllWays(array, 0, 0); // 초기 함수 실행

        for (Integer way : result) {
            if (target == way) {
                targetCount++;
            }
        }
        return targetCount;
    }

    public static void getAllWays(int[] array, int curIndex, int curSum) {
        if (curIndex == array.length) {
            result.add(curSum);
            return;
        }
        getAllWays(array, curIndex + 1, curSum + array[curIndex]); // 더하는 경우
        getAllWays(array, curIndex + 1, curSum - array[curIndex]); // 빼는 경우
    }
}
