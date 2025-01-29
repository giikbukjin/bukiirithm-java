package week3;

public class _0310_Dict {
    public static void main(String[] args) {
        Dict dict = new Dict();
        dict.put("test", 3);
        System.out.println(dict.get("test"));
    }
}

class Dict {
    int[] items;

    public Dict() {
        this.items = new int[8]; // 길이 8의 배열로 초기화
    }

    public void put(String key, int value) {
        // 1. 키 값을 해시 함수 이용해 임의의 해시 값으로 만든다.
        // 2. 해시 값을 배열의 길이로 나눈다.
        // 3. 나눈 나머지를 index 값으로 사용한다.
        int index = key.hashCode() % items.length;

        // 배열의 해당 index에 value를 저장한다.
        items[index] = value;
    }

    public int get(String key) {
        // put 메서드와 마찬가지로 인덱스를 구한다.
        int index = key.hashCode() % items.length;
        // items 배열의 index에 해당하는 value를 반환한다.
        return items[index];
    } 
}