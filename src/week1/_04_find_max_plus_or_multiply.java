package week1;

public class _04_find_max_plus_or_multiply {
    public static void main(String[] args) {
        System.out.println("정답 = 728 현재 풀이 값 = " + result(new int[]{0,3,5,6,1,2,4}));
        System.out.println("정답 = 8820 현재 풀이 값 = " + result(new int[]{3,2,1,5,9,7,4}));
        System.out.println("정답 = 270 현재 풀이 값 = " + result(new int[]{1,1,1,3,3,2,5}));
    }

    public static int result(int[] array) {
        int resultNum = array[0];
        for (int i = 1; i < array.length; i++) { // 시간 복잡도가 O(N)
            if (resultNum + array[i] < resultNum * array[i]) {
                resultNum *= array[i];
            } else {
                resultNum += array[i];
            }
        }
        return resultNum;
    }
}