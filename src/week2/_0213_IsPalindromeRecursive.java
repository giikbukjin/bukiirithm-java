package week2;

public class _0213_IsPalindromeRecursive {
    public static void main(String[] args) {
        System.out.println(isPalindrome("소주만병만주소"));
    }

    public static boolean isPalindrome(String string) {
        int stringLength = string.length();

        if (string.charAt(0) != string.charAt(stringLength - 1)) {
            return false; // 맨 앞 & 맨 뒤 글자가 서로 다를 경우 false 반환
        }
        if (stringLength <= 1) { // 한글자 이하일 경우 무조건 true 반환
            return true;
        }
        // 맨 앞 & 맨 뒤 글자를 제거한 후 재귀함수 실행
        return isPalindrome(string.substring(1, stringLength - 1));
    }
}
