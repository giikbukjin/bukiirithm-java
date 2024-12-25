package week2;

public class _0207_IsExistingTargetNumberSequential {
    public static void main(String[] args) {
        int findingTarget = 14;
        int[] findingNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println(isExistingTargetNumberSequential(findingTarget, findingNumbers));
    }

    public static boolean isExistingTargetNumberSequential(int target, int[] array) {
        for (int number : array) {
            if (number == target) {
                return true;
            }
        }
        return false;
    }
}
