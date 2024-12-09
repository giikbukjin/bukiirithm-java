package week1;

import java.util.*;
import java.io.*;

public class _05_find_not_repeating_first_char {
    public static void main(String[] args) {
        System.out.println("정답 = d 현재 풀이 값 = " + result("abadabac"));
        System.out.println("정답 = c 현재 풀이 값 = " + result("aabbcddd"));
        System.out.println("정답 = _ 현재 풀이 값 = " + result("aaaaaaaa"));
    }

    public static char result(String str) {
        int[] alphabetCountArr = new int[26]; // 알파벳별 빈도 수 저장하는 배열

        for (int i = 0; i < str.length(); i++) { // 문자열 길이만큼 돌면서 한 글자씩 검사
            alphabetCountArr[str.charAt(i) - 'a']++; // 해당 알파벳 위치 인덱스 1 증가
        }
        for (int i = 0; i < str.length(); i++) { // 다시 문자열 길이만큼 돌면서 한 글자씩 검사
            // 배열 값이 1(중복되지 않음)인 알파벳 검사
            if (alphabetCountArr[str.charAt(i) - 'a'] == 1) {
                return str.charAt(i); // return 이용해 첫 번째 알파벳 반환
            }
        }
        return '_'; // 중복되지 않는 알파벳 없으면 '-' 출력
    }
}