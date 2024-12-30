package week2;

import java.util.Arrays;

public class _0215_IsAvailableToOrder {
    public static void main(String[] args) {
        String[] shopMenu = {"만두", "떡볶이", "오뎅", "사이다", "콜라"};
        String[] shopOrders = {"오뎅", "콜라", "만두"};

        System.out.println(isAvailableToOrder(shopMenu, shopOrders));
    }

    public static boolean isAvailableToOrder(String[] menu, String[] orders) {
        Arrays.sort(menu);

        for (String item : orders) {
            if (!isExistingTargetNumberSequential(item, menu)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isExistingTargetNumberSequential(String target, String[] array) {
        int minIndex = 0;
        int maxIndex = array.length - 1;
        int halfIndex = (maxIndex + maxIndex) / 2; // 중간 값

        while (minIndex <= maxIndex) {
            if (array[halfIndex].equals(target)) {
                return true;
            } else if (array[halfIndex].compareTo(target) > 0) {
                maxIndex = halfIndex - 1;
            } else {
                minIndex = halfIndex + 1;
            }
            halfIndex = (maxIndex + maxIndex) / 2;
        }
        return false;
    }
}
