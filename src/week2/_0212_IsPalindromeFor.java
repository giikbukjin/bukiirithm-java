package week2;

public class _0212_IsPalindromeFor {
    public static void main(String[] args) {
        String input = "abcba";
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String string) {
        int length = string.length();
        for (int i = 0; i < length; i++) {
            if (string.charAt(i) != string.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
