import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveZeroSumConsecutiveNodes {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        
        for (ListNode curr = dummy; curr != null; curr = curr.next) {
            sum += curr.val;
            map.put(sum, curr);
        }
        
        sum = 0;
        for (ListNode curr = dummy; curr != null; curr = curr.next) {
            sum += curr.val;
            curr.next = map.get(sum).next;
        }
        
        return dummy.next;
    }
    
    // Utility function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveZeroSumConsecutiveNodes remover = new RemoveZeroSumConsecutiveNodes();
        
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(-3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(1);
        
        System.out.println("Original Linked List:");
        printList(head);
        
        ListNode newHead = remover.removeZeroSumSublists(head);
        
        System.out.println("Linked List after removing zero sum consecutive nodes:");
        printList(newHead);
    }
}
