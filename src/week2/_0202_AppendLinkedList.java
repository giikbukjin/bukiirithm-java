package week2;

public class _0202_AppendLinkedList {
    public static void main(String[] args) {
        Node node = new Node(3); // 노드 객체 생성 후 data애 3 넣기
        System.out.println(node.data + " " + node.next); // data는 3, next는 null로 출력

        LinkedList linkedList = new LinkedList(5); // 링크드 리스트 객체 생성 후 5 넣기
        System.out.println(linkedList.head.data); // 맨 앞 노드의 data인 5 출력

        linkedList.append(12); // 값이 5인 head 노드 뒤에 값이 12인 노드 추가
        linkedList.append(8); // 값이 12인 노드 뒤에 값이 8인 노드 추가
        linkedList.printAll(); // 노드 모두 출력 : 5 12 8
    }
}

class Node { // 노드 클래스
    public int data; // 노드가 담고 있는 데이터
    public Node next; // 다음 노드를 가리키는 포인터

    public Node(int data) {
        this.data = data; // 노드에 데이터 담기
        this.next = null; // 각 노드는 개별이므로 다음 노드를 정의하지 않아 null 담기
    }
}

class LinkedList { // 링크드 리스트 클래스
    public Node head; // 맨 앞의 노드

    public LinkedList(int value) {
        this.head = new Node(value); // 노드 객체에 value를 넣어 head 초기화
    }

    public void append(int value) { // 맨 마지막 노드 뒤에 노드를 추가하는 메서드
        Node cur = this.head; // 현재 노드에 head 담기

        while (cur.next != null) { // head에서부터 타고 가다가 노드의 next가 Null이 나오기 전까지 반복
            cur = cur.next; // 현재 노드를 다음 노드로 변경
        }
        cur.next = new Node(value); // 마지막 노드에 도달 후 next를 새 노드 객체로 설정
    }

    public void printAll() { // 연결된 노드들을 모두 출력하는 메서드
        Node cur = this.head; // 현재 노드에 head 담기

        while (cur != null) { // head에서부터 타고 가다가 현재 노드가 Null이 나오기 전까지 반복
            System.out.print(cur.data + " "); // 현재 노드의 data 출력
            cur = cur.next; // 현재 노드를 다음 노드로 변경
        }
    }
}