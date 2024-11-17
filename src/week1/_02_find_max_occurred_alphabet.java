package week1;

import java.util.*;
import java.io.*;

public class _02_find_max_occurred_alphabet {
    public static char result(String str) {
        int[] alphabetArr = new int[26];
        int maxCount = 0;
        int maxIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) { // 알파벳이면(=띄어쓰기가 아니면)
                alphabetArr[str.charAt(i) - 'a']++; // a(0)~z(25) 중 해당하는 인덱스 개수 증가
            }
        }
        for (int i = 0; i < alphabetArr.length; i++) {
            if (alphabetArr[i] > maxCount) { // 빈도수가 가장 많은 알파벳 찾기
                maxCount = alphabetArr[i];
                maxIndex = i;
            }
        }
        return (char)(maxIndex + 'a'); // 가장 많이 나온 인덱스를 다시 알파벳으로 변환
    }

    public static void main(String[] args) {
        System.out.println("정답 = i 현재 풀이 값 = " + result("hello my name is dingcodingco"));
        System.out.println("정답 = e 현재 풀이 값 = " + result("we love algorithm"));
        System.out.println("정답 = b 현재 풀이 값 = " + result("best of best youtube"));
    }
}