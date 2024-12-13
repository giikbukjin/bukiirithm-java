package week1;

public class _07_find_count_turn_out_all_0_or_1 {
    public static void main(String[] args) {
        String input = "0001100";
        System.out.println(Math.min(result(input, '0'), result(input, '1')));
    }

    public static int result(String input, char defaultValue) {
        int count = 0; // 뒤집는 횟수 저장
        // input 저장할 배열 선언. 맨 앞 인덱스에는 기본값 넣기
        char[] inputArr = new char[input.length() + 1];
        inputArr[0] = defaultValue; // 설정한 기본값을 배열 0번쨰에 넣음

        for (int i = 1; i < inputArr.length; i++) {
            inputArr[i] = input.charAt(i - 1); // input으로 배열 채우기
        }

        for (int i = 0; i < inputArr.length; i++) {
            // 기본값에서 다른 값으로 바뀌면 count 증가. 마지막 값은 비교하지 않는다.
            if (i != inputArr.length - 1 && inputArr[i] == defaultValue && inputArr[i + 1] != defaultValue) {
                count++;
            }
        }
        return count;
    }
}
