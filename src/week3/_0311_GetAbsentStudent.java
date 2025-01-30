package week3;

import java.util.HashMap;

public class _0311_GetAbsentStudent {
    public static void main(String[] args) {
        String[] allStudents = {"나연", "정연", "모모", "사나", "지효", "미나", "다현", "채영", "쯔위"};
        String[] presentStudents = {"정연", "모모", "채영", "쯔위", "사나", "나연", "미나", "다현"};
        System.out.println(getAbsentStudent(allStudents, presentStudents));

        System.out.println("정답 = 예지 / 현재 풀이 값 = " + getAbsentStudent(new String[]{"류진","예지","채령","리아","유나"}, new String[]{"리아","류진","채령","유나"}));
        System.out.println("정답 = RM / 현재 풀이 값 = " + getAbsentStudent(new String[]{"정국","진","뷔","슈가","지민","RM"}, new String[]{"뷔","정국","지민","진","슈가"}));
    }

    public static String getAbsentStudent(String[] allArr, String[] presentArr) {
        HashMap<String, String> items = new HashMap<>();

        for (String a : allArr) {
            items.put(a, a); // 해시 테이블에 (key, value) 넣기
        }

        for (String a : presentArr) {
            items.remove(a); // 목록에 존재하는 항목 제거
        }

        for (String a : items.keySet()) {
             return items.get(a); // 남은 항목 출력
        }
        return null;
    }
}