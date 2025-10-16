class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Q40 {
    public static boolean search(ListNode head, int target) {
        if (head == null) {
            return false;
        }
        if (head.val == target) {
            return true;
        }
        return search(head.next, target);
    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(9);
        System.out.print("Linked list: ");
        printList(head);
        int target = 5;
        System.out.println("Searching " + target + " recursively: " + search(head, target));
        target = 10;
        System.out.println("Searching " + target + " recursively: " + search(head, target));
    }
}