package week2;

public class _0206_GetLinkedListSum {
    public static void main(String[] args) {
        LinkedList5 linkedList1 = new LinkedList5(6);
        linkedList1.append(7);
        linkedList1.append(8);

        LinkedList5 linkedList2 = new LinkedList5(3);
        linkedList2.append(5);
        linkedList2.append(4);

        System.out.println(linkedList1.getLinkedListSum(linkedList1)
                + linkedList2.getLinkedListSum(linkedList2)); // 두 링크드 리스트의 합 반환
    }
}

class Node5 { // 노드 클래스
    public int data; // 노드가 담고 있는 데이터
    public Node5 next; // 다음 노드를 가리키는 포인터

    public Node5(int data) {
        this.data = data; // 노드에 데이터 담기
        this.next = null; // 각 노드는 개별이므로 다음 노드를 정의하지 않아 null 담기
    }
}

class LinkedList5 { // 링크드 리스트 클래스
    public Node5 head; // 맨 앞의 노드

    // 노드 객체에 value를 넣어 head 초기화
    public LinkedList5(int value) {
        this.head = new Node5(value);
    }

    // 맨 마지막 노드 뒤에 노드를 추가하는 메서드
    public void append(int value) {
        Node5 cur = this.head; // 현재 노드에 head 담기

        while (cur.next != null) { // head에서부터 타고 가다가 노드의 next가 Null이 나오기 전까지 반복
            cur = cur.next; // 현재 노드를 다음 노드로 변경
        }
        cur.next = new Node5(value); // 마지막 노드에 도달 후 next를 새 노드 객체로 설정
    }

    // 링크드 리스트 하나의 노드 합계를 구하는 메서드
    public int getLinkedListSum(LinkedList5 linkedList) {
        Node5 cur = linkedList.head; // 현재 노드에 head 담기
        int sum = 0;

        while (cur != null) { // head에서부터 타고 가다가 노드가 Null이 나오기 전까지 반복
            sum = sum * 10 + cur.data; // 현재 합에 10을 곱한 후 다음 노드를 더해 자리수가 이루어지도록 함
            cur = cur.next; // 현재 노드를 다음 노드로 변경
        }
        return sum;
    }
}