package week1;

public class _03_is_number_exist {
    public static void main(String[] args) {
        System.out.println("정답 = true / 현재 풀이 값 = " + result(3, new int[]{3, 5, 6, 1, 2, 4}));
        System.out.println("정답 = false / 현재 풀이 값 = " + result(7, new int[]{6, 6, 6}));
        System.out.println("정답 = true / 현재 풀이 값 = " + result(2, new int[]{6, 9, 2, 7, 1888}));
    }

    public static boolean result(int number, int[] array) {
        for (int element : array) { // 시간 복잡도 : N
            if (element == number) {
                return true;
            }
        }
        return false;
    }
}
