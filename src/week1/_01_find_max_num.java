package week1;

import java.util.*;
import java.io.*;

public class _01_find_max_num {
    public static int find_max_num(int[] array) {
        int max = 0;
        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("정답 = 6 / 현재 풀이 값 = " + find_max_num(new int[]{3, 5, 6, 1, 2, 4}));
        System.out.println("정답 = 6 / 현재 풀이 값 = " + find_max_num(new int[]{6, 6, 6}));
        System.out.println("정답 = 1888 / 현재 풀이 값 = " + find_max_num(new int[]{6, 9, 2, 7, 1888}));
    }
}