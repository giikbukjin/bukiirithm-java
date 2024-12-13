package week1;

import java.util.*;
import java.io.*;

public class _06_find_prime_list_under_number {
    public static void main(String[] args) {
        System.out.println(result(20)); // [1, 2, 3]과 같은 형식으로 출력됨
    }

    public static ArrayList<Integer> result(int input) {
        ArrayList<Integer> primeList = new ArrayList<>();

        for (int i = 2; i <= input; i++) { // 주어진 수보다 작은 수 전부 탐색 (오름차순)
            boolean isPrime = true;

            for (int prime : primeList) { // 나누는 수는 input보다 작은 소수
                if (i * i <= prime && i % prime == 0) { // 나누어 떯어지면(소수가 아니면)
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeList.add(i); // 목록에 소수 추가
            }
        }
        return primeList;
    }
}