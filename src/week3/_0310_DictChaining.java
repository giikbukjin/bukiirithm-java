package week3;

import java.util.LinkedList;

public class _0310_DictChaining {
    public static void main(String[] args) {
        LinkedDict dict = new LinkedDict();
        dict.put("test", 3);
        System.out.println(dict.get("test"));
    }
}

class LinkedTuple {
    LinkedList<Node> items;

    public LinkedTuple() {
        this.items = new LinkedList<>();
    }

    public void add(String key, int value) {
        items.add(new Node(key, value));
    }

    public Integer get(String key) {
        for (Node n : items) { // 키 값을 비교해 동일하면 value 반환
            if (n.key.equals(key)) {
                return n.value;
            }
        }
        return null;
    }
}

class LinkedDict {
    LinkedTuple[] items;

    public LinkedDict() {
        this.items = new LinkedTuple[8]; // 길이 8의 배열로 초기화

        for (int i = 0; i < 8; i++) { // 배열 각 인덱스에 LinkedTuple 추가
            items[i] = new LinkedTuple();
        }
    }

    public void put(String key, int value) {
        // 1. 키 값을 해시 함수 이용해 임의의 해시 값으로 만든다.
        // 2. 해시 값을 배열의 길이로 나눈 나머지를 index 값으로 사용한다.
        int index = key.hashCode() % items.length;

        // 배열의 해당 index에 LinkedTuple의 key, value를 저장한다.
        // [(key, value)] 형태로 저장
        items[index].add(key, value);
    }

    public int get(String key) {
        // put 메서드와 마찬가지로 인덱스를 구한다.
        int index = key.hashCode() % items.length;
        // 배열의 index에 해당하는 LinkedTuple의 value를 반환한다.
        return items[index].get(key);
    }
}

class Node {
    String key;
    int value;

    public Node(String key, int value) {
        this.key = key;
        this.value = value;
    }
}
