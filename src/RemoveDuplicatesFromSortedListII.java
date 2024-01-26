class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveDuplicatesFromSortedListII {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            boolean isDuplicate = false;

            while (current.next != null && current.val == current.next.val) {
                current = current.next;
                isDuplicate = true;
            }

            if (isDuplicate) {
                prev.next = current.next;
            } else {
                prev = prev.next;
            }

            current = current.next;
        }

        return dummy.next;
    }

    // Example usage:
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedListII remover = new RemoveDuplicatesFromSortedListII();

        // Create a sorted linked list with duplicates
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        // Remove duplicates
        ListNode result = remover.deleteDuplicates(head);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
