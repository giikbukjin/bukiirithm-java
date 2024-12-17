package week2;

public class _0203_GetNodeLinkedList {
    public static void main(String[] args) {
        LinkedList2 linkedList = new LinkedList2(5); // 링크드 리스트 객체 생성 후 5 넣기

        linkedList.append(12); // 값이 5인 head 노드 뒤에 값이 12인 노드 추가
        System.out.println(linkedList.getNode(0).data); // 0번째 index 노드의 data 출력
    }
}

class Node2 { // 노드 클래스
    public int data; // 노드가 담고 있는 데이터
    public Node2 next; // 다음 노드를 가리키는 포인터

    public Node2(int data) {
        this.data = data; // 노드에 데이터 담기
        this.next = null; // 각 노드는 개별이므로 다음 노드를 정의하지 않아 null 담기
    }
}

class LinkedList2 { // 링크드 리스트 클래스
    public Node2 head; // 맨 앞의 노드

    // 노드 객체에 value를 넣어 head 초기화
    public LinkedList2(int value) {
        this.head = new Node2(value);
    }

    // 맨 마지막 노드 뒤에 노드를 추가하는 메서드
    public void append(int value) {
        Node2 cur = this.head; // 현재 노드에 head 담기

        while (cur.next != null) { // head에서부터 타고 가다가 노드의 next가 Null이 나오기 전까지 반복
            cur = cur.next; // 현재 노드를 다음 노드로 변경
        }
        cur.next = new Node2(value); // 마지막 노드에 도달 후 next를 새 노드 객체로 설정
    }

    // 연결된 노드들을 모두 출력하는 메서드
    public void printAll() {
        Node2 cur = this.head; // 현재 노드에 head 담기

        while (cur != null) { // head에서부터 타고 가다가 현재 노드가 Null이 나오기 전까지 반복
            System.out.print(cur.data + " "); // 현재 노드의 data 출력
            cur = cur.next; // 현재 노드를 다음 노드로 변경
        }
    }

    // index 위치에 있는 노드 반환하는 메서드
    public Node2 getNode(int index) {
        Node2 cur = this.head; // 현재 노드에 head 담기
        int curIndex = 0; // index와 비교할 curIndex 변수 선언

        while (curIndex != index) { // count와 index가 같아질 때까지 반복
            cur = cur.next; // 현재 노드를 다음 노드로 변경
            curIndex++; // curIndex 1 증가
        }
        return cur; // index 위치에 있는 cur 노드 반환
    }
}