package week2;

public class _0214_GetKthNodeFromLast {
    public static void main(String[] args) {
        LinkedList14 linkedList = new LinkedList14(6);
        linkedList.append(7);
        linkedList.append(8);

        System.out.println(linkedList.getKthNode(2).data);
    }
}

class Node14 {
    public int data;
    public Node14 next;

    public Node14(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList14 {
    public Node14 head;

    public LinkedList14(int value) {
        this.head = new Node14(value);
    }

    public void append(int value) {
        Node14 cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node14(value);
    }

    // linkedList는 한 방향으로밖에 이동하지 못함

    // 첫 번째 방법
    // 현재 linkedList의 길이 구해서 앞에서부터 길이 - K번째 값이 문제의 답

    // 두 번째 방법
    // k만큼 떨어져 있는 두 노드 slow와 fast를 한 칸씩 이동시키며 fast가 끝에 도달하면 slow가 문제의 답

    public Node14 getKthNode(int k) {
        Node14 fast = this.head;
        Node14 slow = this.head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}