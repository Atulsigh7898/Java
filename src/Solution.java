class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Move the second pointer to the nth node from the beginning
        for (int i = 0; i <= n; i++) {
            second = second.next;
        }
        
        // Move both pointers simultaneously until the second pointer reaches the end
        while (second != null) {
            first = first.next;
            second = second.next;
        }
        
        // Adjust the pointers to remove the nth node from the end
        first.next = first.next.next;
        
        return dummy.next;
    }
    public class Main {
        public static void main(String[] args) {
            // Create the linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
            
            int n = 2;
            
            Solution solution = new Solution();
            ListNode newHead = solution.removeNthFromEnd(head, n);
            
            // Print the modified linked list
            ListNode current = newHead;
            while (current != null) {
                System.out.print(current.val + " -> ");
                current = current.next;
            }
        }
    }
    public boolean isPalindrome(ListNode head) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isPalindrome'");
    }
    
}
