class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class PartitionList2 {

    public static ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode(0);
        ListNode lessTail = lessHead;

        ListNode greaterHead = new ListNode(0);
        ListNode greaterTail = greaterHead;

        while (head != null) {
            if (head.val < x) {
                lessTail.next = head;
                lessTail = lessTail.next;
            } else {
                greaterTail.next = head;
                greaterTail = greaterTail.next;
            }
            head = head.next;
        }

        greaterTail.next = null; // Set the next of greaterTail to null to avoid cycles in the final list.
        lessTail.next = greaterHead.next; // Connect the two partitions.

        return lessHead.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        System.out.println("Original List:");
        printList(head);

        int x = 3;
        ListNode result = partition(head, x);

        System.out.println("List after partitioning around " + x + ":");
        printList(result);
    }
}
